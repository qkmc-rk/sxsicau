package xyz.ruankun.sxsicau.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.ruankun.sxsicau.entity.WxToken;
import xyz.ruankun.sxsicau.entity.WxUser;
import xyz.ruankun.sxsicau.service.UserService;
import xyz.ruankun.sxsicau.util.Constant;
import xyz.ruankun.sxsicau.vo.ResponseEntity;

import java.util.Date;
import java.util.Map;


@RestController
@RequestMapping("/wxuser")
public class WxUserController {

    @Autowired
    UserService userService;

    @GetMapping("/token")
    @ApiOperation(value = "这是登录接口，获取token")
    public ResponseEntity login(@RequestParam(required = true) String code){
        ResponseEntity responseEntity = new ResponseEntity();
        if (code == null || code.trim().equals("")){
            responseEntity.error(Constant.LOGIN_CODE_ERROR,"错误的code传入","");
        }
        Integer rs = userService.login(code);

        /**
         * 以下逻辑：
         *    成功，则从返回的userId从redis拿到token 送给用户
         *    失败：根据失败的根源返回不同的失败信息
         */
        if (rs.equals(Constant.LOGIN_NO_USER)) {
            //用户未注册
            responseEntity.error(Constant.LOGIN_NO_USER, "没有注册, 无法登陆", null);
        } else if (rs.equals(Constant.LOGIN_CODE_ERROR)) {
            //传入的code有误
            responseEntity.error(Constant.LOGIN_CODE_ERROR, "小程序CODE检查失败, 青确保传入了正确的CODE", null);
        } else if (rs.equals(Constant.LOGIN_CODE_USED)) {
            //该code已经被使用
            responseEntity.error(Constant.LOGIN_CODE_USED, "小程序的CODE已经被使用过了", null);
        } else if (rs.equals(Constant.LOGIN_SERVER_ERROR)) {
            responseEntity.error(Constant.LOGIN_SERVER_ERROR, "缓存失败", null);
        } else if(rs.equals(Constant.LOGIN_BLACK_USER)){
            responseEntity.error(Constant.LOGIN_BLACK_USER, "你已被限制登陆，请联系管理员", null);
        } else if(rs.equals(Constant.FLUSH_TOKEN_ERROR)){
            responseEntity.error(Constant.FLUSH_TOKEN_ERROR, "刷新缓存时出现异常", null);
        }
        else {
            //登录成功 返回的是userid
            WxToken wxToken = null;
            wxToken = userService.getWxTokenByWxTokenId(rs);
            //还要查看用户是否已经绑定过用户信息了
            WxUser wxUser = userService.getUser(wxToken.getUserId());
            if (wxUser != null)
                if (wxUser.getBindingNumber() == null)
                    wxToken.setIsBinded(false);
                else
                    wxToken.setIsBinded(true);

            responseEntity.success(Constant.LOGIN_SUCCESS, "登陆成功", wxToken);
        }
        return responseEntity;
    }

    @PutMapping("/register")
    @ApiOperation(value = "注册接口")
    public ResponseEntity register(@RequestParam String code){
        ResponseEntity responseEntity = new ResponseEntity();
        WxUser wxUser = new WxUser();
        wxUser.setBlack(false);
        wxUser.setBindingNumber(null);
        wxUser.setBindingRole(null);
        wxUser.setGmtCreate(new Date());
        wxUser.setGmtModified(new Date());
        wxUser.setWxNumber(null);
        Integer rs = userService.register(code,wxUser);
        if (rs.equals(Constant.REGISTER_ALREADY_DOWN)) {
            //用户未注册
            responseEntity.error(Constant.REGISTER_ALREADY_DOWN, "REGISTER_ALREADY_DOWN", null);
        } else if (rs.equals(Constant.REGISTER_CODE_ERROR)) {
            //传入的code有误
            responseEntity.error(Constant.REGISTER_CODE_ERROR, "REGISTER_CODE_ERROR", null);
        } else if (rs.equals(Constant.REGISTER_CODE_USED)) {
            //该code已经被使用
            responseEntity.error(Constant.REGISTER_CODE_USED, "REGISTER_CODE_USED", null);
        } else if (rs.equals(Constant.REGISTER_SERVER_ERROR)) {
            responseEntity.error(Constant.REGISTER_SERVER_ERROR, "REGISTER_SERVER_ERROR", null);
        } else {
            //注册成功 返回的是token id
            WxToken token = userService.getWxTokenByWxTokenId(rs);
            token.setIsBinded(false);   // 新注册的用户是没有绑定的，直接返回没有绑定
            responseEntity.success(Constant.LOGIN_SUCCESS, "register and login success", token);
        }
        return responseEntity;
    }

    /**
     *  绑定用户的学号/教职工号和密码
     * @param account
     * @param role
     * @param password
     * @return
     */
    @PostMapping("/binding")
    @ApiOperation(value = "绑定用户的信息💞, 绑定用户的学号/教职工号和密码")
    public ResponseEntity binding(@RequestHeader String token, @RequestParam String account,@RequestParam(required = false) Integer role,@RequestParam String password){
        WxToken wxToken = userService.getWxTokenByToken(token);
        Integer userId = wxToken.getUserId();
        if (role == null){
            role = 0;   // 默认绑定的为学生身份
        }else if (role != 0){
            role = 1;   // 不是学生那你就是要绑定成为一个教师
        }
        Map<String, String> map = userService.bindingUser(userId, role, account, password);

        if (map.get("ERROR") != null){
            return ControllerUtil.getFalseResultMsgBySelf(map.get("ERROR"));
        }else if (map.get("SUCCESS") != null){
            return ControllerUtil.getSuccessResultBySelf(map.get("SUCCESS"));
        }else
            return ControllerUtil.getFalseResultMsgBySelf("绑定用户时发生了未知错误");
    }
}

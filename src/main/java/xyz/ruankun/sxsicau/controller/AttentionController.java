package xyz.ruankun.sxsicau.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.ruankun.sxsicau.annotation.Authentication;
import xyz.ruankun.sxsicau.entity.Follow;
import xyz.ruankun.sxsicau.entity.Practice;
import xyz.ruankun.sxsicau.service.UserInfoService;
import xyz.ruankun.sxsicau.service.UserService;
import xyz.ruankun.sxsicau.util.constant.AuthAopConstant;
import xyz.ruankun.sxsicau.vo.ResponseEntity;
import xyz.ruankun.sxsicau.vo.fvo.FollowStudentVO;

import java.util.List;
import java.util.Map;


/**
 * 关注控制器
 * 1. 添加关注
 * 1.5 取消关注
 * 2. 查看自己关注的人的列表以及详细信息
 * 3. 查看自己关注的人的实习信息
 *  3.1 查看单个关注者的实习信息
 *  3.2 查看所有的关注者的实习信息
 */
@RestController
@RequestMapping("/attention")
public class AttentionController {

    @Autowired
    UserService userService;
    @Autowired
    UserInfoService userInfoService;

    @PutMapping("")
    @Authentication(role = AuthAopConstant.BOTH)
    public ResponseEntity payAttentionTo(@RequestHeader String token,@RequestParam String sxStudentId){
        String method = "payAttentionTo";
        return attention(token, sxStudentId, method);
    }
    @PostMapping("")
    @Authentication(role = AuthAopConstant.BOTH)
    public ResponseEntity cancelAttention(@RequestHeader String token,@RequestParam String sxStudentId){
        String method = "cancelAttention";
        return attention(token, sxStudentId, method);
    }

    @GetMapping("/{wxUserId}")
    @Authentication(role = AuthAopConstant.BOTH)
    public ResponseEntity getMyAttention(@PathVariable Integer wxUserId){
        Map<String, Object> rs = userInfoService.getMyAttention(wxUserId);
        if (rs.get("ERROR") != null){
            // 这是一个错误的结果
            return ControllerUtil.getFalseResultMsgBySelf( (String) rs.get("ERROR") );
        }else {
            // 这是正确的结果
            return ControllerUtil.getDataResult( rs.get("SUCCESS") );
        }
    }
    @GetMapping("/practices")
    @Authentication(role = AuthAopConstant.BOTH)
    public ResponseEntity getPractices(@RequestHeader String token){
        Integer wxUserId = new ControllerUtil().getWxUserId(token);
        Map<String, Object> rs = userInfoService.getMyAttention(wxUserId);
        if (rs.get("ERROR") != null){
            // 这是一个错误的结果
            return ControllerUtil.getFalseResultMsgBySelf( (String) rs.get("ERROR") );
        }else {
            // 拿到了用户的所有信息
            // 根据信息拿到practice
            List<FollowStudentVO> followStudentVOSwithPractice = userInfoService.getPractices( (List<FollowStudentVO>) rs.get("SUCCESS"));
            rs.put("SUCCESS", followStudentVOSwithPractice);
            return ControllerUtil.getDataResult( rs.get("SUCCESS") );
        }
    }
    @GetMapping("/practice/{sxStudentId}")
    @Authentication(role = AuthAopConstant.BOTH)
    public ResponseEntity getPractices(@RequestHeader String token, @PathVariable String sxStudentId){
        Integer wxUserId = new ControllerUtil().getWxUserId(token);
        List<Practice> practices = userInfoService.findPracticesOfHerOrHim(wxUserId, sxStudentId);
        if (practices == null || practices.size() == 0){
            return ControllerUtil.getFalseResultMsgBySelf("没有找到关注者的实习信息");
        }else {
            return ControllerUtil.getDataResult(practices);
        }
    }




    /**
     *  简单封装一下两个方法，因为有很多地方有共同代码，减少代码的冗余
     *  不过复杂度提高可读性降低
     * @param token
     * @param sxStudentId
     * @param methond
     * @return
     */
    private ResponseEntity attention(@RequestHeader String token,
                                    @RequestParam String sxStudentId,
                                    String methond){
        Integer wxUserId = new ControllerUtil().getWxUserId(token);
        Map<String, Object> rs = null;
        if (methond.equals("payAttentionTo"))
            rs = userInfoService.followHer0rHim(sxStudentId, wxUserId);
        else if (methond.equals("cancelAttention"))
            rs = userInfoService.cancelFollow(sxStudentId, wxUserId);
        if (rs.get("ERROR") != null){
            // 这是一个错误的结果
            return ControllerUtil.getFalseResultMsgBySelf( (String) rs.get("ERROR") );
        }else {
            // 这是正确的结果
            return ControllerUtil.getDataResult( (Follow) rs.get("SUCCESS") );
        }
    }
}

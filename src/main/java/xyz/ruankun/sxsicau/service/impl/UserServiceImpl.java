package xyz.ruankun.sxsicau.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;
import xyz.ruankun.sxsicau.entity.Student;
import xyz.ruankun.sxsicau.entity.Teacher;
import xyz.ruankun.sxsicau.entity.WxToken;
import xyz.ruankun.sxsicau.entity.WxUser;
import xyz.ruankun.sxsicau.repository.StudentRepository;
import xyz.ruankun.sxsicau.repository.TeacherRepository;
import xyz.ruankun.sxsicau.repository.WxTokenRepository;
import xyz.ruankun.sxsicau.repository.WxUserRepository;
import xyz.ruankun.sxsicau.service.UserService;
import xyz.ruankun.sxsicau.util.Constant;
import xyz.ruankun.sxsicau.util.MD5Util;
import xyz.ruankun.sxsicau.vo.weixin.WxServerResult;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private RestTemplate restTemplate;

    private final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);


    @Value("${weixin.secret}")
    private String SECRET;
    @Value("${weixin.appid}")
    private String APPID;
    @Value("${weixin.api}")
    private String API;
    @Value("${wx.login.valid_number}")
    private Integer LOGIN_VALID_TIME;

    @Autowired
    WxUserRepository wxUserRepository;
    @Autowired
    WxTokenRepository wxTokenRepository;

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    TeacherRepository teacherRepository;

    @Override
    public Integer login(String code) {
        WxServerResult wxServerResult =
                requestWxServerWithCode(code);
        Integer errCode = wxServerResult.getErrcode();
        if (null != errCode) {
            if (errCode.equals(Constant.WX_ERROR_CODE)) return Constant.LOGIN_CODE_ERROR;
            if (errCode.equals(Constant.WX_USED_CODE)) return Constant.LOGIN_CODE_USED;
        }
        // 没有返回错误码则说明返回了session_key和openid
        WxUser wxUser = wxUserRepository.findByOpenId(wxServerResult.getOpenid());
        if (null == wxUser) return Constant.LOGIN_NO_USER;
        else {
            if (wxUser.getBlack()){
                return Constant.LOGIN_BLACK_USER;
            }
            // 成功后还要缓存session_key和token
            // sessionKey没用，在本项目中用不到
            // String session_key = wxServerResult.getSession_key();
            // 存储session，并返回登录成功后的用户ID
            WxToken wxToken = updateToken(wxUser.getId());
            if (wxToken == null)
                return Constant.FLUSH_TOKEN_ERROR;
            else {
                return wxToken.getId();
            }
        }
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Integer register(String code, WxUser user) {
        WxServerResult wxServerResult = requestWxServerWithCode(code);
        if (wxServerResult.getErrcode() != null && wxServerResult.getErrcode().equals(Constant.WX_ERROR_CODE))
            return Constant.REGISTER_CODE_ERROR;
        if (wxServerResult.getErrcode() != null && wxServerResult.getErrcode().equals(Constant.WX_USED_CODE))
            return Constant.REGISTER_CODE_USED;

        logger.info("注册：ERR_CODE:{}", wxServerResult.getErrcode());
        logger.info("注册：openid:{}", wxServerResult.getOpenid());
        // 拉取用户的session_key和openid成功
        // 检验是否注册过

        WxUser wxUser = wxUserRepository.findByOpenId(wxServerResult.getOpenid());
        if (wxUser != null) return Constant.REGISTER_ALREADY_DOWN;//早已注册过
        //正式进行注册
        user.setOpenId(wxServerResult.getOpenid());
        WxUser rs = wxUserRepository.save(user);
        if (rs != null) {
            // 注册成功
            // 然后生成token保存，并返回
            WxToken wxToken = updateToken(rs.getId());
            if (wxToken != null)
                return wxToken.getId();
            else
                return Constant.FLUSH_TOKEN_ERROR;

        }
        return Constant.AOP_SERVER_ERROR;
    }

    @Override
    public WxUser getUser(Integer userId) {
        try {
            return wxUserRepository.findById(userId).get();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public WxUser save(WxUser user) {
        return null;
    }

    @Override
    public WxToken getWxTokenByWxTokenId(Integer wxTokenId) {
        return wxTokenRepository.findById(wxTokenId.intValue());
    }

    @Override
    @Transactional
    public Map<String, String> bindingUser(Integer userId, Integer role, String account, String password) {
        Map<String, String> map = new HashMap<>();
        Student student = null;
        Teacher teacher = null;
        if (role == 0){
            // 绑定学生
            student = studentRepository.findBySx_student_idAndSx_student_password(account, password);
        }else{
            role = 1;
            // 绑定老师 role != 0
            teacher = teacherRepository.findBySx_teacher_idAndSx_teacher_password(account, password);
        }
        if (student != null || teacher != null){
            //账号密码输入正确
            WxUser wxUser = wxUserRepository.findById(userId.intValue());
            if (wxUser != null){
                wxUser.setBindingRole(role);
                wxUser.setBindingNumber(account);
                try {
                    wxUserRepository.saveAndFlush(wxUser);
                    map.put("SUCCESS", "绑定成功!");
                } catch (Exception e) {
                    e.printStackTrace();
                    map.put("ERROR", "绑定信息保存到数据库时发生错误");
                }
            }else {
                map.put("ERROR", "找不到微信用户，ID是" + userId + ",请联系管理员验证是否存在");
            }
        }else{
            //账号密码输入错误
            map.put("ERROR", "用户名密码不匹配, 无法绑定!");
        }
        return map;
    }

    @Override
    public WxToken getWxTokenByToken(String token) {
        WxToken wxToken = null;
        try {
            wxToken = wxTokenRepository.findByToken(token);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return wxToken;
    }


    /**
     * 封装了请求微信服务端的代码，传入code，请求后，将结果封装成为一个WxServerResult对象返回
     *
     * @param code
     * @return 微信服务器请求的结果
     */
    private WxServerResult requestWxServerWithCode(String code) {
        StringBuilder uri = new StringBuilder();
        uri.append(API);
        // appid
        uri.append("?appid=" + APPID);
        // SECRET
        uri.append("&secret=" + SECRET);
        // code
        uri.append("&js_code=" + code);
        // grant_type
        uri.append("&grant_type=authorization_code");

        String uriStr = uri.toString();
        logger.info(uriStr);
        String strBody = getBody(restTemplate, uriStr);
        logger.info(strBody);
        //到数据库查询是否存在openId为某一值的记录
        ObjectMapper objectMapper = new ObjectMapper();
        WxServerResult wxServerResult = null;
        try {
            wxServerResult = objectMapper.readValue(strBody, WxServerResult.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wxServerResult;
    }

    /**
     *  该方法发送简单的get请求，并获取相应数据
     *
     * @param restTemplate
     * @param uri
     * @return 服务器响应数据
     */
    private String getBody(RestTemplate restTemplate, String uri) {
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(uri, String.class);
        if (responseEntity.getStatusCodeValue() == 200)
            return responseEntity.getBody();
        return null;
    }

    /**
     *  用户更新用户的Token，若是过期了就生成新的token返回
     *  若没有过期，更新其有效期，然后返回
     * @param userId
     * @return
     */
    private WxToken updateToken(Integer userId){
        List<WxToken> wxTokens = wxTokenRepository.findAllByUserId(userId);
        WxToken wxToken = new WxToken();
        wxToken.setId(0);
        //找到最近的一个
        if (wxTokens != null){
            for (WxToken w : wxTokens){
                if (w.getId() > wxToken.getId())
                    wxToken = w;
            }
        }
        //查看session是否过期
        if (new Date().getTime() - wxToken.getModifiedTime().getTime() > LOGIN_VALID_TIME){
            //登录已经过期了
            WxToken wxToken1 = new WxToken();
            Date date = new Date();
            wxToken1.setCreateTime(date);
            wxToken1.setModifiedTime(date);
            wxToken1.setToken(MD5Util.md5(date.toString()));
            wxToken1.setIp("0.0.0.0");
            wxToken1.setUserId(wxToken.getUserId());
            wxToken1.setValidity(LOGIN_VALID_TIME);
            try {
                return wxTokenRepository.save(wxToken1);
            } catch (Exception e) {
                e.printStackTrace();
                logger.error("保存session到数据库时失败了");
            }
        }else {
            //登录没有过期，刷新有效时间后返回
            wxToken.setModifiedTime(new Date());
            if (wxTokenRepository.saveAndFlush(wxToken) != null){
                // 刷新成功 //返回token的ID
                return wxToken;
            }else {
                return null;
            }
        }
        return null;
    }
}

package xyz.ruankun.sxsicau.service;

import xyz.ruankun.sxsicau.entity.WxToken;
import xyz.ruankun.sxsicau.entity.WxUser;

import java.util.Map;

/**
 * 微信小程序用户登录注册等功能
 */
public interface UserService {

    /**
     * 小程序的登录包含注册内容
     * 传入小程序的code，服务器从微信服务器拉取openid与session_key
     * 判断数据库中是否存在该openid,从而进行注册/登录成功，成功后生成token
     * 将token与userid存入redis<userid,token>，返回给用户token
     * @param code
     * @return 成功返回userId，其它情况返回错误代码
     */
    Integer login(String code);

    /**
     * 注册一个用户，注册完成后跳到登录去
     * @param code
     * @param user
     * @return
     */
    Integer register(String code, WxUser user);

    /**
     * 获取一个用户的信息
     * @param userId
     * @return
     */
    WxUser getUser(Integer userId);

    /**
     * 保存一个微信用户的信息
     * 一般用来修改用户信息时使用，比如绑定微信号操作
     * 应该包含update User方案
     * @param user
     * @return
     */
    WxUser save(WxUser user);
    WxToken getWxTokenByWxTokenId(Integer wxTokenId);


    Map<String, String> bindingUser(Integer userId, Integer role, String account, String password);


    WxToken getWxTokenByToken(String token);
}

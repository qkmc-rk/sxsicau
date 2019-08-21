package xyz.ruankun.sxsicau.vo.weixin;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 当微信调用登录接口时，从微信服务器获取登录信息，将信息封装为一个对象。
 */
public class WxServerResult {

    @JsonProperty("session_key")
    private String session_key;

    @JsonProperty("openid")
    private String openid;

    @JsonProperty("errcode")
    private Integer errcode;

    @JsonProperty("errmsg")
    private String errmsg;

    public String getSession_key() {
        return session_key;
    }

    public void setSession_key(String session_key) {
        this.session_key = session_key;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public Integer getErrcode() {
        return errcode;
    }

    public void setErrcode(Integer errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }
}

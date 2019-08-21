package xyz.ruankun.sxsicau.util.constant;

/**
 * 这里面存的常量是请求微信accesstoken时返回的错误代码
 */
public interface WxAccessTokenReturnConstant {

    //这些代码由微信官方统一定义，官方未更改时，严禁更改代码

    Integer ERRCODE_SERVER_BUSY = -1;   //系统繁忙，此时请开发者稍候再试
    Integer ERRCODE_SUCCESS = 0;    //系统繁忙，此时请开发者稍候再试
    Integer ERRCODE_WRONG_APPSECRET = 40001;    //AppSecret 错误或者 AppSecret 不属于这个小程序，请开发者确认 AppSecret 的正确性
    Integer ERRCODE_GRANT_TYPE = 40002;     //请确保 grant_type 字段值为 client_credential
    Integer ERRCODE_WRONG_APPID = 40013;    //不合法的 AppID，请开发者检查 AppID 的正确性，避免异常字符，注意大小写
}

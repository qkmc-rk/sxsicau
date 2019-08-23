package xyz.ruankun.sxsicau.util;

public interface Constant {

    Integer SUCCESS_CODE = 1;
    //public final static is default
    Integer FAILURE_CODE = -1;

    String MSG_CLIENT_DATA_ERROR = "客户端数据错误";

    String MSG_SUCCESS = "响应成功";

    String MSG_SERVER_ERROR = "服务器故障";

    String MSG_INVALID_OPERATION = "非法操作";

    //登录时要用的CODE

    //成功登录
    Integer LOGIN_SUCCESS = 1;

    //未注册
    Integer LOGIN_NO_USER = 0;

    //传入code 有误登录失败
    Integer LOGIN_CODE_ERROR = -1;

    //传入的code已经被使用了
    Integer LOGIN_CODE_USED = -2;

    //服务器在处理一些操作的时候发生了异常
    Integer LOGIN_SERVER_ERROR = -3;

    Integer LOGIN_BLACK_USER = -4;

    Integer FLUSH_TOKEN_ERROR = -5;

    //注册时要用的CODE

    //成功注册
    Integer REGISTER_SUCCESS = 1;

    //已经注册过了
    Integer REGISTER_ALREADY_DOWN = 0;

    //传入code 有误注册失败
    Integer REGISTER_CODE_ERROR = -1;

    //传入的code已经被使用了
    Integer REGISTER_CODE_USED = -2;

    //服务器在处理一些操作的时候发生了异常
    Integer REGISTER_SERVER_ERROR = -3;


    //登录时微信返回的code
    //已经被使用的code
    Integer WX_USED_CODE = 40163;
    Integer WX_ERROR_CODE = 40029;

    //使用aop处理时抛出了异常
    Integer AOP_SERVER_ERROR = -4;

    Integer AUTH_ERROR = 403;

    Integer TEACHER = 1;
    Integer STUDENT = 0;

}

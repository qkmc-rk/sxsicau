package xyz.ruankun.sxsicau.util.code;

public interface AddrCode {

    Integer SUCCESS_OPERATION = 22;
    Integer ERROR_PARAMS = 23;
    Integer NO_EXIST = 24;
    Integer INVALID_OPERATION = 25;

    String NO_SUCH_Addr = "地址信息不存在！!";
    String SUCCESS_MSG = "操作成功！";
    String INVALID_MSG = "非法操作！";
    String FAILURE_MSG = "操作失败";
    String INVALID_DATA = "非法数据请求";
}

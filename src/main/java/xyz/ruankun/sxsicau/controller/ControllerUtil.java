package xyz.ruankun.sxsicau.controller;

import xyz.ruankun.sxsicau.util.Constant;
import xyz.ruankun.sxsicau.util.DataCode;
import xyz.ruankun.sxsicau.vo.ResponseEntity;

public class ControllerUtil {

    /**
     * 代码这个东西浓缩就是精华
     * @param rs 真真假假
     * @return 假假真真
     */
    public static ResponseEntity getTrueOrFalseResult(boolean rs){
        ResponseEntity responseEntity = new ResponseEntity();
        if (rs)
            responseEntity.success(null);
        else
            responseEntity.error(Constant.FAILURE_CODE,"方法执行时返回了false","");
        return responseEntity;
    }

    /**
     * 浓缩就是精华
     * @param data  缩阴功
     * @param <T> 缩阴功
     * @return 缩阴功的结果
     */
    public static <T> ResponseEntity<T> getDataResult(T data){
        ResponseEntity<T> responseEntity = new ResponseEntity<>();
        if (null != data)
            responseEntity.success(data);
        else
            responseEntity.error(Constant.FAILURE_CODE,"ControllerUtil.getDataResult获得空的数据",null);
        return responseEntity;
    }

    public static <T> ResponseEntity<T> getSuccessResultBySelf(T data){
        ResponseEntity responseEntity = new ResponseEntity<>();
        responseEntity.success(data);
        return responseEntity;
    }
    public static <T> ResponseEntity<T> getFalseResultMsgBySelf(String msg){
        ResponseEntity responseEntity = new ResponseEntity<>();
        responseEntity.error(Constant.FAILURE_CODE,msg,null);
        return responseEntity;
    }


    public static <T> ResponseEntity<T> parData(Integer result, T data){
        ResponseEntity responseEntity = new ResponseEntity();
        if(result == DataCode.DATA_CONFLIC){
            responseEntity.error(-1, "数据冲突", null);
        }else if(result == DataCode.DATA_OPERATION_ERROR){
            responseEntity.error(-1, "操作失败", null);
        }else if(result == DataCode.DATA_OPERATION_SUCCESS){
            responseEntity.success(data);
        }else if(result == DataCode.DATA_OPERATION_FAILURE){
            responseEntity.serverError();
        }
        return responseEntity;
    }
}

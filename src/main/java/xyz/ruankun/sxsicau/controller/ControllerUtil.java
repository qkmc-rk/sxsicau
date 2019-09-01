package xyz.ruankun.sxsicau.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xyz.ruankun.sxsicau.entity.WxToken;
import xyz.ruankun.sxsicau.entity.WxUser;
import xyz.ruankun.sxsicau.service.UserInfoService;
import xyz.ruankun.sxsicau.service.UserService;
import xyz.ruankun.sxsicau.util.Constant;
import xyz.ruankun.sxsicau.util.DataCode;
import xyz.ruankun.sxsicau.vo.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

/**
 * 这个类封装着一些控制器中公共的代码块
 */
@Component
public class ControllerUtil {

    Logger logger = LoggerFactory.getLogger(ControllerUtil.class);

    @Autowired
    UserService userService;
    @Autowired
    UserInfoService userInfoService;

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

    /**
     * 封装让代码看起来不是屎
     * @param token 令牌信息
     * @return 返回🔨
     */
    public Map<String, Object> youGetUserByToken(String token){
        HashMap<String, Object> map = new HashMap<>();
        if (token == null){
            map.put("ERROR", "token不能为空");
            return map;
        }
        WxToken wxToken = userService.gotWxTokenByToken(token);
        if (wxToken == null){
            map.put("ERROR","token信息查不到或者token已经过期");
            return map;
        }
        Integer userId = wxToken.getUserId();
        if (userId == null){
            map.put("ERROR","wxToken对象有误，查不到userId信息: " + wxToken.toString());
            return map;
        }
        WxUser wxUser = userService.getUser(userId);
        if (wxUser == null){
            map.put("ERROR","该userId是错误的值对象，数据库查不到该ID的user：" + userId);
            return map;
        }
        map.put("SUCCESS", wxUser);
        return map;
    }

    /**
     * 通过token换取WxUser ID
     * @param token
     * @return wxUser的ID
     */
    public Integer getWxUserId(String token){
        Map<String, Object> map = youGetUserByToken(token);
        if (map.get("ERROR") == null){
            WxUser wxUser = (WxUser) map.get("SUCCESS");
            if (wxUser != null){
                return wxUser.getId();
            }else {
                return null;
            }
        }else {
            logger.error("出错了，错误信息：" + map.get("ERROR"));
            return null;
        }
    }
}

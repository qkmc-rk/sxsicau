package xyz.ruankun.sxsicau.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;
import com.github.qcloudsms.httpclient.HTTPException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 腾讯云短信服务工具，用于发送短信
 */
@Component
public class SMSUtil {

    private static String phoneNumber;

    public  String getPhoneNumber() {
        return phoneNumber;
    }

    @Value("${qcloud.sms.adminphonenumber}")
    public  void setPhoneNumber(String phoneNumber) {
        SMSUtil.phoneNumber = phoneNumber;
    }

    /**
     * 发送单条短信，需要传入模板ID,模板中需要的参数
     * @param appid
     * @param appKey
     * @param phoneNumber
     * @param templateId 模板ID
     *                   <b>这里没有传入签名信息，使用默认签名信息</b>
     * @param params 模板中需要的参数
     * @return
     * 错误情况 RESULT = {"result":1014,"errmsg":"package format error, template params error","ext":""}
     * 正确情况 RESULT = {"result":0,"errmsg":"OK","ext":"","sid":"26:19081221441923987","fee":2}
     */
    public static Map<String, Object> sendSMSByOne(Integer appid, String appKey,
                                                   String phoneNumber, Integer templateId,
                                                   String[] params){
        System.out.println("sendSMSByOne电话号码:" + phoneNumber);
        String phone = phoneNumber;
        Map<String, Object> map = new HashMap<>();
        //准备参数
        //int type = 0;//普通短信,1位营销短信
        String nationCode = "86";
        //根据模板获取消息
        try {
            SmsSingleSender ssender = new SmsSingleSender(appid,appKey);
            SmsSingleSenderResult result = ssender.
                    sendWithParam(nationCode,phone,templateId,params,"","","");
            map.put("SUCCESS","send sms successfully");
            ObjectMapper objectMapper = new ObjectMapper();
            SMSResult smsResult = objectMapper.readValue(result.toString(),SMSResult.class);
            map.put("RESULT",smsResult);
        } catch (HTTPException e) {
            map.put("error","HTTPException");
            map.put("stackError",e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            map.put("error","IOException");
            map.put("stackError",e.getMessage());
            e.printStackTrace();
        }
        return map;
    }

    public static Map<String, Object> sendSMSToAdmin(Integer appid, String appKey, Integer templateId,
                                                   String[] params){
        Map<String, Object> map =  sendSMSByOne(appid,appKey,phoneNumber,templateId,params);
        if (map.get("error") == null){
            SMSResult s = (SMSResult) map.get("RESULT");
            System.out.println(s.toString());
        }
        return map;
    }

    /**
     * 错误情况 RESULT = {"result":1014,"errmsg":"package format error, template params error","ext":""}
     * 正确情况 RESULT = {"result":0,"errmsg":"OK","ext":"","sid":"26:19081221441923987","fee":2}
     * @param args
     */
//    public static void main(String[] args){
//        Integer appid=1400241538;
//        String appkey="00d0eb8ad59429552a4054ea504b7344";
//        String phonenumber = "18783551223";
//        Integer templateId = 393638;
//        String params[] = {"坤坤", "12345648913165489414", "12", "5465458965"};
//        Map<String, String> map = sendSMSByOne(appid,appkey,phonenumber,templateId,params);
//        System.out.println(map.toString());
//    }


}

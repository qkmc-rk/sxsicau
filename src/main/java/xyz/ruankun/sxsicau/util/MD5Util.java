package xyz.ruankun.sxsicau.util;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Value;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * MD5通用类
 *
 * @author 浩令天下
 * @version 1.0.0_1
 * @since 2017.04.15
 */
public class MD5Util {

    @Value("${md5util.key}")
    private static String key;

//    @Value("${machinemother.phone.regex}")
    private static String regex = "^[1](([3|5|8][\\d])|([4][4,5,6,7,8,9])|([6][2,5,6,7])|([7][^9])|([9][1,8,9]))[\\d]{8}$";

    /**
     * MD5方法
     *
     * @param text 明文
     * @return 密文
     * @throws Exception
     */
    public static String md5(String text) {
        //加密后的字符串
        String encodeStr = DigestUtils.md5Hex(text + key);
        System.out.println("MD5加密后的字符串为:encodeStr=" + encodeStr);
        return encodeStr;
    }

    /**
     * MD5验证方法
     *
     * @param text 明文
     * @param md5  密文
     * @return true/false
     * @throws Exception
     */
    public static boolean verify(String text, String md5) {
        //根据传入的密钥进行验证
        String md5Text = md5(text);
        if (md5Text.equalsIgnoreCase(md5)) {
            System.out.println("MD5验证通过");
            return true;
        }

        return false;
    }

    public static String randStr() {
        return randomStr();
    }

    private static String randomStr() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((int) (Math.random() * 1000000000));
        return stringBuilder.toString();
    }

    public static String randomTenNums() {
        StringBuilder stringBuilder = new StringBuilder();
        int x = (int) (Math.random() * 1000000000);
        stringBuilder.append(x);
        stringBuilder.append(String.valueOf(x).charAt(3));
        return stringBuilder.toString();
    }

    public static String trueMd5(String text) {
        System.out.println("before using algorithm:" + text);
        String str = DigestUtils.md5Hex(text);
        System.out.println("after using algorithm override：" + str);
        return str;
    }

    /**
     * 手机号正则判断
     * @param phone
     * @return
     */
    public static Boolean parsePhone(String phone){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches()&& (phone.length()==11);
    }
}

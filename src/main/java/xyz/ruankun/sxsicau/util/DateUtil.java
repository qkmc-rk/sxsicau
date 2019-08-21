package xyz.ruankun.sxsicau.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 第三次写这个类了， 狗屎
 * 时间处理工具
 */
public class DateUtil {

    /**
     * 传入指定月份， 返回从该月一号至下月一号之间的时间
     *
     * @param text yyyy-MM
     * @return
     */
    public static Map<String, Date> parse(String text) {
        Map<String, Date> map = new LinkedHashMap<>();
        try {
            String[] datas = text.split("-");
            //获取年份和月份
            int year = Integer.valueOf(datas[0]);
            int month = Integer.valueOf(datas[1]);

            Calendar calendar = Calendar.getInstance();
            calendar.set(year, month - 1, 1, 0, 0, 0);
            Date start = calendar.getTime();
            map.put("start", start);

            calendar.set(Calendar.MONTH, month);
            Date end = calendar.getTime();
            map.put("end", end);

        } catch (Exception e) {
            e.printStackTrace();
            map.put("error", null);
        }
        return map;
    }

    /**
     * 传入起始日期字符串，返回指定日期范围
     *
     * @param first
     * @param last
     * @return
     */
    public static Map<String, Date> parse(String first, String last) {
        Map<String, Date> map = new LinkedHashMap<>();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date start = format.parse(first);
            Date end = format.parse(last);

            map.put("start", start);
            map.put("end", end);
        } catch (ParseException e) {
            e.printStackTrace();
            map.put("error", null);
        }
        return map;
    }

    /**
     * 解析传入的数据，返回相应时间戳的date对象
     *
     * @param text yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static Date getDate(String text) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = format.parse(text);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static Boolean parse(Date start, Date end) {
        Date date = new Date();
        if (start.before(date) && end.after(date)) {
            return true;
        } else {
            return false;
        }
    }
}

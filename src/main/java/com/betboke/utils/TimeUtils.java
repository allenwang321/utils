package com.betboke.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtils {

    /**
     * 日期格式yyyy-MM-dd
     */
    public static String DATE_PATTERN = "yyyy-MM-dd";

    /**
     * 日期时间格式yyyy-MM-dd HH:mm:ss
     */
    public static String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";


    /**
     * 将日期转换为字符串
     *
     * @param date
     * @param formatStr
     * @return
     */
    public static String DateFormat(Date date, String formatStr) {
        SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
        return sdf.format(date);
    }


    /**
     * 将字符串转成时间类型
     *
     * @param str
     * @param formatStr
     * @return
     */
    public static Date StrFormat(String str, String formatStr) {
        SimpleDateFormat sDateFormat = new SimpleDateFormat(formatStr);
        try {
            Date date = sDateFormat.parse(str);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 获取当前时间 <br/> 格式为 yyyy-MM-dd HH:mm:ss
     *
     * @return
     */
    public static String getNow() {
        return DateFormat(new Date(), DATE_TIME_PATTERN);
    }

}

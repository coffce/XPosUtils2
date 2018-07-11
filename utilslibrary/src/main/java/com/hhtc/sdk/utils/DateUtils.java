package com.hhtc.sdk.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Created by yangtao on 2018/4/21.
 */

public class DateUtils {

    /**
     * 国际化日期和时间，如中文展示为：2018-05-09 18:00:22
     *
     * @param time 时间
     * @return
     */
    public static String getInternationalDateTime(long time) {
        Locale locale = Locale.getDefault();
        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, locale);
        return df.format(time);
    }

    /**
     * 国际化日期，如中文展示为：2018-05-09
     *
     * @param time 时间
     * @return
     */
    public static String getInternationalDate(long time) {
        Locale locale = Locale.getDefault();
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, locale);
        return df.format(time);
    }

    /**
     * 国际化时间，如中文展示为：12:00:23
     *
     * @param time 时间
     * @return
     */
    public static String getInternationalTime(long time) {
        Locale locale = Locale.getDefault();
        DateFormat df = DateFormat.getTimeInstance(DateFormat.MEDIUM, locale);
        return df.format(time);
    }

    /**
     * 换算成日期 2018-05-09
     */
    public static String toDate(long time) {
        //设置要获取到什么样的时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //获取String类型的时间
        String dateToTime = sdf.format(time);
        return dateToTime;
    }

    /**
     * 日期格式字符串转换成时间戳
     *
     * @param date_str   字符串日期
     * @param format 如：yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static long date2TimeStamp(String date_str, String format) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            return sdf.parse(date_str).getTime();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

}

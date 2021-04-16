package com.wu.demo2.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static String nowTime() {
        return String.valueOf(System.currentTimeMillis());
    }

    public static String timeStamp2Date(String seconds, String format) {
        if(seconds == null || seconds.isEmpty() || seconds.equals("null")) {
            return "";
        }
        if(format == null || format.isEmpty()) {
            format = "yyyy-MM-dd HH:mm:ss";
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(new Date(Long.valueOf(seconds)));
    }

    public static String Date2TimeStamp(String date, String format) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            return String.valueOf(sdf.parse(date).getTime());
        } catch (Exception e) {
            e.printStackTrace();
            return nowTime();
        }
    }
}

package com.example.myrecyclerviewapp.util;

import java.util.Date;

public class MyUtils {
    public static String getNowTimeString() {
        Date date = new Date();
        String timeFormatString = "%d시 %d분 %d초".toLowerCase();
        return String.format(timeFormatString, date.getHours(), date.getMinutes(), date.getSeconds());
    }
}

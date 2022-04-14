package com.learn.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test05 {
    public static void main(String[] args) {
//        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
//        System.out.println(calendar);
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
        System.out.println(simpleDateFormat.format(date));
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder);
        System.out.println();
        "".replace("w","2");
        int count = 0;

        //20 ~ 20+980-1
        while(20 + (int)(Math.random() * 980) != 20) {
            System.out.println(count++);
        }

        System.out.println("结束了");
    }
}

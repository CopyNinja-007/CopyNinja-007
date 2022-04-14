package com.homework.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Date nowTime = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss a");
        System.out.println(simpleDateFormat.format(nowTime));
        long afterTenDay = nowTime.getTime() + 10 * 24 * 60 * 60 * 1000;
        Date afterTime = new Date(afterTenDay);
        System.out.println(simpleDateFormat.format(afterTime));
    }
}

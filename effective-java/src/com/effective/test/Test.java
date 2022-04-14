package com.effective.test;

import java.util.EnumSet;

public class Test {
    public static void main(String[] args) {

        EnumSet<Season> enumSet = EnumSet.noneOf(Season.class);
        System.out.println(enumSet.getClass());
        EnumSet<Season> enumSet1 = EnumSet.noneOf(Season.class);
        System.out.println(enumSet1);
    }
}

enum Season{
    SPRING,SUMMER,AUTUMN,WINTER
}

interface A {}

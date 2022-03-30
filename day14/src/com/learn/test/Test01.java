package com.learn.test;

import java.util.Collection;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/25 8:26
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Test01 {
    public static void main(String[] args) {
        Season season = Test01.doSome();
        if (season == Season.AUTUMN) {
            System.out.println("Autumn");
        }else if (season == Season.SPRING) {
            System.out.println("Spring");
        }
    }

    public static Season doSome() {
        return Season.SPRING;
    }
}

enum Season {
    SPRING,SUMMER,AUTUMN,WINTER
}


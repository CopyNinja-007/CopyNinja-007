package com.homework.test;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/30 14:14
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class TestDivide {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;
        try {
            int temp = i / j;
        } catch (Exception e) {
            System.out.println(e);
        }finally {
            System.out.println("finally语句块执行了");
        }
    }
}

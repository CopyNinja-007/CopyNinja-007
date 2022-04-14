package com.learn.test;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/4/5 9:17
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
//1：求1-100的和 （10分）
public class Question01 {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i <= 100; i++) {
            sum+=i;
        }
        System.out.println("1~100的和为：" + sum);
    }
}

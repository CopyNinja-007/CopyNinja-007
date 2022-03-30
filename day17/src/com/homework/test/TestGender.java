package com.homework.test;

import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/30 14:40
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class TestGender {
    public static void main(String[] args) {
        boolean flag;
        do {
            try {
                flag=isGender();
            } catch (IllegalArgumentException e) {
                flag = true;
                e.printStackTrace();
            }
        }while(flag);
    }

    private static boolean isGender() throws IllegalArgumentException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的性别:");
        String gender = scanner.nextLine();
        if ("男".equals(gender) || "女".equals(gender)) {
            System.out.println("您的性别符合规则");
            return false;
        }else {
            throw new IllegalArgumentException("性别必须为男或女");
        }
    }

}

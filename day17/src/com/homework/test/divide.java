package com.homework.test;

import com.homework.exception.RegisterException;

import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/30 11:20
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class divide {
    public static void main(String[] args) {
        boolean flag;
        do {
            try {
                flag = register();
            } catch (RegisterException e) {
                flag = true;
                System.out.println(e.getMessage());
            }
        }while(flag);

    }

    private static boolean register()throws RegisterException {
        System.out.println("注册账户");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户名:");
        String userName = scanner.nextLine();
        System.out.print("请输入密码:");
        String password = scanner.nextLine();
        if (userName.length() >= 6 && userName.length() <= 14) {
            System.out.println("注册完成");
            return false;
        } else {
            throw new RegisterException("900", "注册失败,注册时用户名要求长度在[6-14]之间");
        }
    }

}

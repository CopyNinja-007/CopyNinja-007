package com.learn.test;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入邮箱：");
        String email = scanner.nextLine();
        System.out.print("请输入密码：");
        String password = scanner.nextLine();
        if (email != null && password!=null) {
            if (!("".equals(email) && "".equals(password))) {
                if (password.length() >= 6) {
                    if (email.indexOf("@") < email.indexOf(".")) {
                        if ("zhangsan@163.com".equals(email) && "666666".equals(password)) {
                            System.out.println("欢迎用户：" + email.substring(0, email.indexOf("@")) + "登录成功");
                        }else System.out.println("账户或密码不正确");
                    }else System.out.println("@的位置必须在.之前");
                }else System.out.println("密码不能小于6位");
            }else System.out.println("邮箱或密码不能为空串");
        }else System.out.println("邮箱或密码不能为null");
    }
}

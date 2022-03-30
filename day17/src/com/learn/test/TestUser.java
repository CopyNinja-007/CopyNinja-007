package com.learn.test;

import com.learn.exception.LoginException;
import com.learn.model.User;

import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/30 8:18
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class TestUser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("欢迎使用登录系统");

            System.out.print("请输入您的用户名:");
            String userName = scanner.nextLine();
            System.out.print("请输入您的密码:");
            String password = scanner.nextLine();
            User user = new User(userName,password);
            if ("张三".equals(user.getUserName()) && "123".equals(user.getPassword())) {
                System.out.println("用户"+user.getUserName()+",恭喜您，登录成功");
                break;
            }else {
                doSome();
            }
        }

    }
    public static void doSome() {
        throw new LoginException("登录失败");
    }
}

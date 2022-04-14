package com.learn.test;

import com.learn.entity.BooksManagement;

import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/4/5 10:02
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Question06 {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------欢迎使用图书管理系统----------");
        do {
            System.out.println("请输入对应的编号使用功能：1.添加图书 2.删除图书 3.显示图书 4.退出");
            int num = Integer.parseInt(scanner.nextLine());
            switch (num) {
                case 1:
                    BooksManagement.add();
                    break;
                case 2:
                    BooksManagement.deleteById();
                    break;
                case 3:
                    BooksManagement.showBooks();
                    break;
                case 4:
                    flag=false;
                    break;
                default:
                    System.out.println("请输入正确的编号！");
            }
        } while (flag);

    }
}

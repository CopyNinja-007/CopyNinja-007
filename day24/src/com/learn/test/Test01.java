package com.learn.test;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个字符串:");
        String s = scanner.nextLine();
        System.out.println("请输入查找的字符:");
        String s1 = scanner.nextLine();
        char c = s1.charAt(0);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==c) {
                count++;
            }
        }
        System.out.println(count);
    }
}

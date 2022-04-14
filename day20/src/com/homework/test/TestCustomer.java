package com.homework.test;

import com.homework.util.CustomerUtils;

import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/4/2 10:35
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class TestCustomer {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean flag = true;
        do {
            System.out.println("---------------客户信息管理软件---------------");
            System.out.println();
            System.out.println("\t" +"\t" + "\t"+ "\t" +"1 添 加 客 户");
            System.out.println("\t" +"\t" + "\t"+ "\t" +"2 修 改 客 户");
            System.out.println("\t" +"\t" + "\t"+ "\t" +"3 删 除 客 户");
            System.out.println("\t" +"\t" + "\t"+ "\t" +"4 客 户 列 表");
            System.out.println("\t" +"\t" + "\t"+ "\t" +"5 退       出");
            System.out.println();
            System.out.print("\t" +"\t" + "\t"+ "\t" +"请选择(1-5):");
            int num = Integer.parseInt(scanner.nextLine());
            switch (num) {
                case 1:
                    CustomerUtils.add();
                    break;
                case 2:
                    CustomerUtils.set();
                    break;
                case 3:
                    CustomerUtils.remove();
                    break;
                case 4:
                    CustomerUtils.showList();
                    break;
                default:
                    flag = false;
                    return;
            }
        } while (flag);
    }
}

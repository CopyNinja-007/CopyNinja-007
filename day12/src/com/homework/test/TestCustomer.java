package com.homework.test;

import com.homework.entity.Customer;

import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/24 8:18
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class TestCustomer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean whileFlag = true;
        int index;
        while(whileFlag) {
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
                    System.out.println("-------------------添加客户-------------------");
                    System.out.print("姓名:");
                    String name = scanner.nextLine();
                    System.out.print("性别:");
                    String sex = scanner.nextLine();
                    System.out.print("年龄:");
                    int age = Integer.parseInt(scanner.nextLine());
                    System.out.print("电话:");
                    String phoneNum = scanner.nextLine();
                    System.out.print("邮箱:");
                    String email = scanner.nextLine();
                    Customer customer = new Customer(name,sex,age,phoneNum);
                    customer.setEmail(email,scanner);
                    Customer.add(customer);
                    System.out.println("-------------------添加完成-------------------");
                    break;
                case 2:
                    do {
                         System.out.println("-------------------修改客户-------------------");
                        System.out.print("请选择待修改客户编号(-1)退出:");
                        index = Integer.parseInt(scanner.nextLine());
                        if (index == -1) {
                            break;
                        }
                        if (Customer.customer[index-1] != null) {
                            Customer.update(scanner,index);
                            System.out.println("-------------------修改完成-------------------");
                        }else {
                            System.out.println("无法找到指定客户！");
                        }
                    }while (true);

                    break;
                case 3:
                    System.out.println("-------------------删除客户-------------------");
                    while(true) {
                        System.out.print("请选择待修改客户编号(-1退出):");
                        index = Integer.parseInt(scanner.nextLine());
                        if (index == -1) {
                            return;
                        }
                        if (Customer.customer[index-1] != null) {
                            System.out.print("确认是否删除(Y/N):");
                            String rmChar=scanner.nextLine();
                            if ("y".equalsIgnoreCase(rmChar)) {
                                Customer.remove(index);
                                System.out.println("-------------------删除完成-------------------");
                            }else if ("n".equalsIgnoreCase(rmChar)) {
                                System.out.println("已取消删除");
                            }
                            break;
                        }else {
                            System.out.println("无法找到指定客户！");
                        }
                    }
                    break;
                case 4:
                    System.out.println("-------------------客户列表-------------------");
                    Customer.showAll();
                    System.out.println("-----------------客户列表完成-----------------");
                    break;
                case 5:
                    System.out.println("确认是否退出(Y/N)");
                    String exit = scanner.nextLine();
                    if ("y".equalsIgnoreCase(exit)) {
                        whileFlag = false;
                        break;
                    }
                    break;
            }
        }
    }
}

package com.homework.entity;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/24 8:15
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Customer {
    public static Customer[] customer = new Customer[2];
    public static int index;
    private String name;
    private String sex;
    private int age;
    private String phoneNum;
    private String email;

    public Customer() {
    }

    public Customer(String name, String sex, int age, String phoneNum) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email,Scanner scanner) {
        while(email.length() <= 15) {
            System.out.print("输入长度(不大于15)错误,请重新输入:");
            email = scanner.nextLine();
        }
        this.email = email;
    }

    public static void add(Customer customer01) {
        if (index < customer.length) {
            customer[index++] = customer01;
        }else {
            customer = Arrays.copyOf(customer,(int)(customer.length*1.5));
            add(customer01);
        }
    }

    public static void remove(int index) {
        customer[index] = null;
    }

    public static void showAll() {
        System.out.println("编号\t姓名\t性别\t年龄\t电话\t邮箱");
        for (int i = 0; i < customer.length; i++) {
            if (customer[i] == null) {
                break;
            }
            System.out.print(i+1);
            System.out.print("\t");
            System.out.print(customer[i].getName());
            System.out.print("\t");
            System.out.print(customer[i].getSex());
            System.out.print("\t");
            System.out.print(customer[i].getAge());
            System.out.print("\t");
            System.out.print(customer[i].getPhoneNum());
            System.out.print("\t");
            System.out.println(customer[i].getEmail());
        }
    }

    public static void update(Scanner scanner,int index) {
        System.out.print("姓名(" + Customer.customer[index-1].getName() + "):");
        Customer.customer[index-1].setName(scanner.nextLine());
        System.out.print("性别(" + Customer.customer[index-1].getSex() + "):");
        Customer.customer[index-1].setSex(scanner.nextLine());
        System.out.print("年龄(" + Customer.customer[index-1].getAge() + "):");
        Customer.customer[index-1].setAge(Integer.parseInt(scanner.nextLine()));
        System.out.print("电话(" + Customer.customer[index-1].getPhoneNum() + "):");
        Customer.customer[index-1].setPhoneNum(scanner.nextLine());
        System.out.print("邮箱(" + Customer.customer[index-1].getEmail() + "):");
        Customer.customer[index-1].setEmail(scanner.nextLine(),scanner);
    }

}

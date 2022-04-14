package com.homework.util;

import com.homework.entity.Customer;
import com.homework.exception.UserNotExistsException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/4/2 10:35
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class CustomerUtils{
    static List<Customer> customerList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void add() {
        System.out.println("-------------------添加客户-------------------");
        System.out.print("编号:");
        int id = Integer.parseInt(scanner.nextLine());
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
        Customer customer = new Customer(id,name,sex,age,phoneNum,email);
        customerList.add(customer);
        System.out.println("-------------------添加完成-------------------");
    }

    public static void set() {
        boolean flag;
        do {
            System.out.println("-------------------修改客户-------------------");
            System.out.print("请选择待修改客户编号(-1)退出:");
            int index = Integer.parseInt(scanner.nextLine());
            if (index == -1) {
                return;
            }
            int i;
            try {
                i = findIndexById(index);
            } catch (Throwable throwable) {
                throwable.printStackTrace();
                flag = true;
                continue;
            }

            Customer customer = customerList.get(i);
            System.out.print("编号(" + customer.getNo() + "):");
            customer.setNo(Integer.parseInt(scanner.nextLine()));
            System.out.print("姓名(" + customer.getName() + "):");
            customer.setName(scanner.nextLine());
            System.out.print("性别(" + customer.getGender() + "):");
            customer.setGender(scanner.nextLine());
            System.out.print("年龄(" + customer.getAge() + "):");
            customer.setGender(scanner.nextLine());
            System.out.print("电话(" + customer.getTel() + "):");
            customer.setTel(scanner.nextLine());
            System.out.print("邮箱(" + customer.getEmail() + "):");
            customer.setEmail(scanner.nextLine());
            System.out.println("-------------------修改完成-------------------");
            flag = false;
        }while(flag);
    }

    public static void remove() {
        boolean flag;
        do{
            System.out.println("-------------------删除客户-------------------");
            System.out.print("请选择待修改客户编号(-1退出):");
            int index = Integer.parseInt(scanner.nextLine());
            if (index == -1) {
                return;
            }
            int i;
            try {
                i = findIndexById(index);
            } catch (Throwable throwable) {
                throwable.printStackTrace();
                flag = true;
                continue;
            }
                System.out.print("确认是否删除(Y/N):");
                String rmChar=scanner.nextLine();
                if ("y".equalsIgnoreCase(rmChar)) {
                    customerList.remove(i);
                    System.out.println("-------------------删除完成-------------------");
                }else if ("n".equalsIgnoreCase(rmChar)) {
                    System.out.println("已取消删除");
                }
                flag=false;
        }while (flag);
    }

    public static void showList() {
        System.out.println("编号\t姓名\t性别\t年龄\t电话\t邮箱");
        customerList.forEach(System.out::println);
    }

    private static int findIndexById(int id)throws UserNotExistsException{
        Optional<Customer> any = customerList.stream()
                .filter(customer -> customer.getNo() == id)
                .findAny();
        return  customerList.indexOf(any.orElseThrow(() -> new UserNotExistsException("编号为" + id + "的用户不存在")));
    }
}

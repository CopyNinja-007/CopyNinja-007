package com.homework.entity;

import java.util.Objects;
import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/4/2 10:33
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Customer {
    private int no;
    private String name;
    private String gender;
    private int age;
    private String tel;
    private String email;

    public Customer() {
    }

    public Customer(int no, String name, String gender, int age, String tel,String email) {
        this.no = no;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.tel = tel;
        setEmail(email);
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        boolean flag;
        do {
            if (email.length() <= 15) {
                System.out.print("输入长度(不大于15)错误,请重新输入:");
                email = new Scanner(System.in).nextLine();
                flag = true;
            }else flag=false;
        } while (flag);
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return getNo() == customer.getNo() &&
                getAge() == customer.getAge() &&
                Objects.equals(getName(), customer.getName()) &&
                Objects.equals(getGender(), customer.getGender()) &&
                Objects.equals(getTel(), customer.getTel()) &&
                Objects.equals(getEmail(), customer.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNo(), getName(), getGender(), getAge(), getTel(), getEmail());
    }

    @Override
    public String toString() {
        return no + "\t" + name + "\t" + gender + "\t" + age + "\t" + tel + "\t" + email;
    }
}

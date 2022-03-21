package com.homework.entity;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/21 14:24
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Person {
    private String name;
    private int age;
    private Phone phone;

    public Person() {
    }

    public Person(String name, int age, Phone phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public void speak() {
        System.out.println(getName() + "说话");
    }

    public void eatRice() {
        System.out.println(getName() + "吃饭");
    }

    public void call() {
        System.out.print(getName() + "使用");
        phone.callPhone();

    }

    public void playGames() {
        System.out.print(getName() + "使用");
        phone.playGames();
    }
}

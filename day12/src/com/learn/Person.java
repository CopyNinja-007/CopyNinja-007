package com.learn;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/23 9:41
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void eat() {
        System.out.println(name + "正在吃饭");
    }
    public void move() {
        System.out.println(name + "正在走路");
    }
}

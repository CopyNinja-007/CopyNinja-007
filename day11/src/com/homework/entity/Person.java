package com.homework.entity;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/22 14:05
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

    public String display() {
        return "姓名='" + name + '\'' +
                ", 年龄=" + age;
    }
}

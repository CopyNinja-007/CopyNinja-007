package com.learn.model;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/4/2 8:24
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
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

    @Override
    public int compareTo(Student o) {
        int i = this.getAge() - o.getAge();
        if (i == 0) {
            return this.getName().compareTo(o.getName());
        }
        return i;
    }
}

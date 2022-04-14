package com.learn.model;

import java.util.Objects;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/31 10:13
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public abstract class Student {
    private String name;
    private int no;
    private int age;

    public Student() {
    }

    public Student(String name, int no, int age) {
        this.name = name;
        this.no = no;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return no == student.no &&
                age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, no, age);
    }

    public abstract void talkSelf();

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", no=" + no +
                ", age=" + age +
                '}';
    }
}

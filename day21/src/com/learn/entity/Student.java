package com.learn.entity;

import java.util.Objects;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/4/4 8:37
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Student {
    private int id;
    private String sex;
    private String name;

    public Student() {
    }

    public Student(int id, String sex, String name) {
        this.id = id;
        this.sex = sex;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return id == student.id &&
                Objects.equals(sex, student.sex) &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sex, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

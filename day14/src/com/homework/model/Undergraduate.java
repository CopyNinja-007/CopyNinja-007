package com.homework.model;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/25 15:49
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Undergraduate extends Student{
    private String degree;

    public Undergraduate() {

    }

    public Undergraduate(String name, int age, String degree) {
        super(name, age);
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }

    @Override
    public String show() {
        return "Undergraduate{"  +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                "degree='" + degree + '\'' +
                '}';
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}

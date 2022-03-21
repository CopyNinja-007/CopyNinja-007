package com.xieshaoliang.entity;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/21 8:31
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Student {
    private String name;
    private char sex;
    private int age;
    private double score;

    public Student() {

    }

    public Student(String name, char sex, int age, double score) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void study() {
        System.out.println(getName() + "在好好学习");
    }

    public void showMe() {
        System.out.println("大家好，我是练习时长两年半的" + getName());
    }
}

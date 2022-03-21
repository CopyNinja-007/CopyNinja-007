package com.homework.entity;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/21 13:29
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Student {
    private String name;
    private int age;
    private double score;

    public Student() {
    }

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String showMessage() {
        return "姓名：" + getName() + "\t" + "年龄：" + getAge() + "\t" + "分数：" + getScore();
    }

    public void jiangCheng() {
        if (score>95) {
            System.out.println("免于处罚");
        }else if (score >= 80) {
            System.out.println("罚抄作业一次");
        }else {
            System.out.println("罚抄作业一次及罚站一小时");
        }
    }
}

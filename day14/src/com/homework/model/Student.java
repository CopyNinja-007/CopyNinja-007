package com.homework.model;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/25 15:35
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Student {
    private String name;
    private double score;

    public Student() {    }

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}

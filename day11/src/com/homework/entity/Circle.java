package com.homework.entity;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/22 14:12
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Circle {
    public static final double PI = 3.14;
    private double r;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getArea() {
        return PI * (getR() * getR());
    }
    public double getPerimeter() {
        return 2 * PI * getR();
    }
}

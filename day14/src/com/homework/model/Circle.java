package com.homework.model;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/25 14:07
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Circle implements Shap{
    private int r;
    public static final double PI = 3.14;

    public Circle() {
    }

    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return PI * (r * r);
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * r;
    }
}

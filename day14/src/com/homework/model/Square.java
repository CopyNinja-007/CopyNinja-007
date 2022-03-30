package com.homework.model;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/25 14:19
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Square implements Shap {
    private double length;

    public Square() {
    }

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public double getPerimeter() {
        return 4*length;
    }
}

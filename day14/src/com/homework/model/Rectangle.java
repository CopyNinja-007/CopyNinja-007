package com.homework.model;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/25 14:13
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Rectangle implements Shap{
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return (length + width) * 2;
    }
}

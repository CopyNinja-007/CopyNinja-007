package com.learn.entity;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/4/5 9:35
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Square extends Shape{
    private double bian;

    public Square() {
    }

    public Square(double bian) {
        this.bian = bian;
    }

    public double getBian() {
        return bian;
    }

    public void setBian(double bian) {
        this.bian = bian;
    }

    @Override
    public double getArea() {
        return bian*bian;
    }
}

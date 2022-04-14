package com.learn.entity;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/4/5 9:32
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Triangle extends Shape{
    private double bian1;
    private double bian2;
    private double bian3;

    public Triangle() {
    }

    public Triangle(double bian1, double bian2, double bian3) {
        this.bian1 = bian1;
        this.bian2 = bian2;
        this.bian3 = bian3;
    }

    public double getBian1() {
        return bian1;
    }

    public void setBian1(double bian1) {
        this.bian1 = bian1;
    }

    public double getBian2() {
        return bian2;
    }

    public void setBian2(double bian2) {
        this.bian2 = bian2;
    }

    public double getBian3() {
        return bian3;
    }

    public void setBian3(double bian3) {
        this.bian3 = bian3;
    }

    @Override
    public double getArea() {
        return (bian1 + bian2 + bian3)/2;
    }
}

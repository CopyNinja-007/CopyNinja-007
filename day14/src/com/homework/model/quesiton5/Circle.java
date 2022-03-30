package com.homework.model.quesiton5;

public class Circle implements Shap {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public Circle() {
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getArea(double r) {
        double a=pi*r*r;
        return a;
    }

    @Override
    public double getPerimeter(double r) {
        double b=2*pi*r;
        return b;
    }
}

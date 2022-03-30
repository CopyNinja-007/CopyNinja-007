package com.homework.model.quesiton5;

public class Square implements Shap {

    private  double length;

    public Square(double length) {
        this.length = length;
    }

    public Square() {
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea(double length) {
        double a=length*length;
        return a;
    }

    @Override
    public double getPerimeter(double length) {
        double b=4*length;
        return b;
    }
}

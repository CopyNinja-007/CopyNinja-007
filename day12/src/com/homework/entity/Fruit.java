package com.homework.entity;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/23 16:34
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public abstract class Fruit {
    private String shape;

    public Fruit() {
    }

    public Fruit(String shape) {
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }
    public abstract void eat();
}

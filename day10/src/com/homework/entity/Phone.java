package com.homework.entity;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/21 14:21
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Phone {
    private String type;
    private double price;
    private String color;

    public Phone() {
    }

    public Phone(String type, double price, String color) {
        this.type = type;
        this.price = price;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void callPhone() {
        System.out.println(getType() + "打电话");
    }

    public void playGames() {
        System.out.println(getType() + "打游戏");
    }
}

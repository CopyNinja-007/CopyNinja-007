package com.homework.entity;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/21 13:42
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Saiche {
    private double maxSpeed;
    private int horsePower;
    private String type;

    public Saiche() {
    }

    public Saiche(double maxSpeed, int horsePower, String type) {
        this.maxSpeed = maxSpeed;
        this.horsePower = horsePower;
        this.type = type;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void speedUp() {
        System.out.println(getType() + "加速");
    }
    public void speedDown() {
        System.out.println(getType() + "刹车");
    }


}

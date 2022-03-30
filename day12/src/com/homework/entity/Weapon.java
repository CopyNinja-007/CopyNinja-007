package com.homework.entity;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/23 15:58
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public abstract class Weapon {
    private int power;
    private int speed;

    public Weapon() {
    }

    public Weapon(int power, int speed) {
        this.power = power;
        this.speed = speed;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public abstract void attack();
}


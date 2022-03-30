package com.homework.entity;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/23 16:11
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Bullet extends Weapon{
    private String ammoType;

    public Bullet() {
    }

    public Bullet(int power, int speed, String ammoType) {
        super(power, speed);
        this.ammoType = ammoType;
    }

    public String getAmmoType() {
        return ammoType;
    }

    public void setAmmoType(String ammoType) {
        this.ammoType = ammoType;
    }

    public void attack() {
        System.out.println("我是子弹，类型:" + ammoType + ",速度:" + getSpeed() + ",攻击力:" + getPower());
    }
}

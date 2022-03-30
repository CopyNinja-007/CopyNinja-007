package com.homework.entity;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/23 16:03
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Tank extends Weapon {
    private String direction;

    public Tank() {
    }

    public Tank(int power, int speed, String direction) {
        super(power, speed);
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
    public void attack() {
        System.out.println("我是坦克,向" + direction + "方向运动,速度:" + getSpeed() + ",攻击力:" + getPower());
    }

}

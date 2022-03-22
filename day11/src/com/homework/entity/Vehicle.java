package com.homework.entity;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/22 13:35
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Vehicle {
    private double speed;
    private int size;

    public Vehicle() {
    }

    public Vehicle(double speed, int size) {
        this.speed = speed;
        this.size = size;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void move(){
        System.out.println("车子正在移动");
    }
    public void speedUp(int num){
        System.out.print("现在速度：" + this.getSpeed());
        this.speed = this.speed + num;
        System.out.print("------->");
        System.out.print("执行踩油门动作");
        System.out.print("------->");
        System.out.println("当前速度：" + this.getSpeed());
    }
    public void speedDown(int num){
        if (getSpeed() > 0) {
            System.out.print("现在速度：" + this.getSpeed());
            this.speed = this.speed - num;
            if (this.getSpeed() < 0) {
                this.setSpeed(0);
            }
            System.out.print("------->");
            System.out.print("执行踩刹车动作");
            System.out.print("------->");
            System.out.println("当前速度：" + this.getSpeed());
        }else {
            System.out.println("当前速度为"+getSpeed()+"车子已经停下来了");
        }
    }

}

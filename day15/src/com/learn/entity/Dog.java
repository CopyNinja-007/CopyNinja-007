package com.learn.entity;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/28 10:04
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Dog extends Pet{

    private String size;

    public Dog() {

    }

    public Dog(String name, int age, int health, String size) {
        super(name, age, health);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void move() {
        System.out.println(getName() + "在跑");
    }
    public void eat() {
        System.out.println(getName() + "在吃东西");
    };
    public void action() {
        System.out.println(getName() + "在吐舌头");
    }
}

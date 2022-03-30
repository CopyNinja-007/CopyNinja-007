package com.learn.entity;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/28 10:26
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Pet {
    private String name;
    private int age;
    private int health;

    public Pet() {
    }

    public Pet(String name, int age, int health) {
        this.name = name;
        this.age = age;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void move() {}
    public void action(){}
    public void eat(){}
}

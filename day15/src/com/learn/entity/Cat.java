package com.learn.entity;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/28 10:07
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Cat extends Pet{

    private String breed;

    public Cat() {

    }

    public Cat(String name, int age, int health, String breed) {
        super(name, age, health);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void move() {
        System.out.println(getName() + "在跑");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                '}';
    }

    public void eat() {
        System.out.println(getName() + "在吃猫粮");

    }
    public void action() {
        System.out.println(getName() + "在抓老鼠");
    }
}

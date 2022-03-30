package com.learn;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/23 9:21
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Pet {
    private String name;
    private int health;
    private int love;
    private String sex;

    public Pet() {
    }

    public Pet(String name, int health, int love, String sex) {
        this.name = name;
        this.health = health;
        this.love = love;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

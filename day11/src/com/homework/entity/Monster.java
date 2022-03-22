package com.homework.entity;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/21 14:49
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Monster {
    private String name;
    private int attack;
    private int hp;

    public Monster() {
    }

    public Monster(String name, int attack, int hp) {
        this.name = name;
        this.attack = attack;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void runSkill() {
        System.out.println(getName() + "使用了奔跑技能");
    }

    public void powerAttack(UltraMan ultraMan) {
        
        if (ultraMan.getHp() > 0) {
            System.out.println(getName() + "使用了蛮力攻击");
            ultraMan.setHp(ultraMan.getHp() - this.attack);
        }
        if (ultraMan.getHp() <= 0) {
            System.out.println(ultraMan.getName() + "被击败");
        }
    }
}

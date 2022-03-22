package com.homework.entity;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/21 14:44
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class UltraMan {
    private String name;
    private int attack;
    private int hp;

    public UltraMan() {
    }

    public UltraMan(String name, int attack, int hp) {
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

    public void fly() {
        System.out.println(getName() + "使用了飞行技能");
    }
    public void lightAttack(Monster monster) {
        if (monster.getHp() > 0) {
            System.out.println(getName() + "使用了光线攻击");
            monster.setHp(monster.getHp() - this.attack);
        }
        if (monster.getHp() <= 0) {
            System.out.println(monster.getName() + "被击败");
        }
    }

}

package com.xieshaoliang.entity;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/21 9:14
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Hero {
    private String name;
    private int level;
    private int hp;
    private int attackPower;

    public Hero(String name, int level, int hp, int attackPower) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.attackPower = attackPower;
    }

    public Hero() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public void moving() {
        System.out.println(name + "正在移动");
    }

    public void attack(Hero hero) {
        System.out.println(name + "正在攻击");
        hero.setHp(hero.getHp() - this.getAttackPower());
        if (hero.getHp() < 0) {
            hero.comeBack();
        }

    }

    public void comeBack() {
        System.out.println(name + "正在回城");
    }

}

package com.xieshaoliang.test;

import com.xieshaoliang.entity.Hero;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/21 8:13
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Test01 {
    public static void main(String[] args) {
        Hero yaSuo = new Hero("疾风剑豪",18,2300,480);
        Hero nanQiang = new Hero("法外狂徒",16,2100,701);
        System.out.println(yaSuo.getName() + "\t" + yaSuo.getLevel() + "\t" + yaSuo.getHp() + "\t" + yaSuo.getAttackPower());
        System.out.println(nanQiang.getName() + "\t" + nanQiang.getLevel() + "\t" + nanQiang.getHp() + "\t" + nanQiang.getAttackPower());
        yaSuo.moving();
        nanQiang.moving();
        nanQiang.attack(yaSuo);
        yaSuo.attack(nanQiang);
        System.out.println(yaSuo.getHp());
        System.out.println(nanQiang.getHp());
        nanQiang.attack(yaSuo);
        yaSuo.attack(nanQiang);
        nanQiang.attack(yaSuo);
        yaSuo.attack(nanQiang);
        nanQiang.attack(yaSuo);
        yaSuo.attack(nanQiang);
        yaSuo.attack(nanQiang);
        System.out.println(yaSuo.getHp());
        System.out.println(nanQiang.getHp());


    }
}

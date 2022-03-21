package com.homework.test;

import com.homework.entity.Monster;
import com.homework.entity.UltraMan;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/21 15:04
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Test04 {
    public static void main(String[] args) {
        UltraMan ultraMan = new UltraMan("咸蛋超人",250,800);
        Monster monster = new Monster("哥斯拉",160,500);
        ultraMan.fly();
        monster.runSkill();
        ultraMan.lightAttack(monster);
        monster.powerAttack(ultraMan);
        ultraMan.lightAttack(monster);
    }
}

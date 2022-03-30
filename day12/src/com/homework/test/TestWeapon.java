package com.homework.test;

import com.homework.entity.Bullet;
import com.homework.entity.Tank;
import com.homework.entity.Weapon;

import java.util.Random;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/23 16:06
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class TestWeapon {
    public static void main(String[] args) {
        Random random = new Random();
        int index = random.nextInt(2);
        Weapon weapon = new Bullet(180,80,"爆炎弹");
        if (index == 0) {
            weapon = new Tank(400,40,"东南");
        }
        weapon.attack();
    }
}

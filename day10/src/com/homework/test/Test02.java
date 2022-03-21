package com.homework.test;

import com.homework.entity.SaiCheShou;
import com.homework.entity.Saiche;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/21 14:09
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Test02 {
    public static void main(String[] args) {
        Saiche saiche01 = new Saiche(200,170,"凯迪拉克");
        SaiCheShou saiCheShou = new SaiCheShou("张三","1008611438",saiche01);
        saiCheShou.drive();
        saiCheShou.stopDrive();
    }
}

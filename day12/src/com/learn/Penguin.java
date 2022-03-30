package com.learn;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/23 9:05
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Penguin extends Pet{

    public void print() {
        System.out.println("Penguin{" +
                "name='" + getName() + '\'' +
                ", health=" + getHealth() +
                ", love=" + getLove() +
                ", sex='" + getSex()+ '\'' +
                '}');
    }

}

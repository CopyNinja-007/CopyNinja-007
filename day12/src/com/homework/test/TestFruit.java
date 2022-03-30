package com.homework.test;

import com.homework.entity.Fruit;
import com.homework.entity.Game;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/23 16:50
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class TestFruit {
    public static void main(String[] args) {
        Game game = new Game();
        Fruit fruit = game.winning();
        fruit.eat();
    }
}

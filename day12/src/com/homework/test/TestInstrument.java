package com.homework.test;

import com.homework.entity.Instrument;
import com.homework.entity.Piano;
import com.homework.entity.Violin;

import java.util.Random;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/23 16:26
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class TestInstrument {
    public static void main(String[] args) {
        Random random = new Random();
        int index = random.nextInt(2);
        Instrument instrument = new Piano();
        if (index == 0) {
            instrument = new Violin();
        }
        instrument.play();

    }
}

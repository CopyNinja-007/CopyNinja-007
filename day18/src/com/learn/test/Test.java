package com.learn.test;

import java.util.ArrayList;
import java.util.Optional;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/31 8:17
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList(10);
        list.add("A");
        list.add("H");
        list.add("F");
        list.add("Z");
        list.add("A");
        Optional<String> min = list.stream()
                .min((o1, o2    ) -> o1.compareTo(o2));
        min.ifPresent(System.out::println);
    }
}

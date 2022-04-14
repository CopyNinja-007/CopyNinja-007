package com.homework.test;

import java.util.HashMap;
import java.util.Map;

public class Test03 {
    public static void main(String[] args) {
        Map<Integer, String> map=new HashMap<>();
        map.put(1,"张三丰");
        map.put(2,"周芷若");
        map.put(3,"汪峰");
        map.put(4,"灭绝师太");
        for (Integer a:map.keySet()) {
            System.out.println(a);
            System.out.println(map.get(a));
        }
        map.put(5,"郭靖");
        map.remove(1);
        map.replace(2,"周林");
    }
}

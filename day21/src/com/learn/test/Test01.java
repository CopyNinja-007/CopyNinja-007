package com.learn.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/4/4 11:17
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Test01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("张三");
        list.add("张三");
        list.add("张三");
        for (String str1 : list) {
            System.out.println(str1);
        }
        HashSet<String> hashSet = new HashSet<>(list);
        for (String str : hashSet) {
            System.out.println(str);
        }
    }
}

package com.homework.test;


import java.util.*;

public class Question6 {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap();
        List<String> list = new ArrayList<>();
        list.add("zzzsdfew");
        list.add("zzzsdfew");
        list.add("zz8huyyg88776(**dfew");
        list.add("zzzsdfew");
        list.add("zzzsdfew!#@$#@T");
        list.add("zzzsdfew");
        list.add("zzzsdfew");
        for (String str : list) {
            for (char by : str.toCharArray()) {
                map.put(by,0);
            }
        }
        for (Map.Entry<Character,Integer> entry: map.entrySet()) {
            Integer i = 0;
            for (String str : list) {
                for (char by : str.toCharArray()) {
                    if (by == entry.getKey()) {
                        i++;
                    }
                }
            }
            map.put(entry.getKey(),i);
        }

        map.forEach((key,value) -> System.out.println(key + "=" + value));

    }
}

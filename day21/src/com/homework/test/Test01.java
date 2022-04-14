package com.homework.test;


import com.homework.entity.Husband;
import com.homework.entity.Wife;

import java.util.*;

public class Test01 {
    public static void main(String[] args) {
        HashMap<Husband, Wife> map=new HashMap<>();
        map.put(new Husband("张三",22),new Wife("李蕾",21));
        map.put(new Husband("李四",22),new Wife("李蕾1",21));
        map.put(new Husband("王五",22),new Wife("李蕾2",21));
        List<Wife> list=new ArrayList<>();
        list.add(new Wife("主z",23));
        list.add(new Wife("此案z",23));
        list.add(new Wife("zz暗队",23));
        list.add(new Wife("z微软",23));
        HashMap<Husband,List<Wife>> husbandListHashMap=new HashMap<>();
        husbandListHashMap.put(new Husband("李四",22),list);
        for (Husband key:map.keySet()) {
            map.get(key).shopping();
        }

        for (Husband key:husbandListHashMap.keySet()) {
            for (Wife a:husbandListHashMap.get(key)) {
                a.shopping();
            }
        }

    }
}

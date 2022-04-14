package com.learn.test;


import com.learn.entity.Workers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        List<Workers> list = new ArrayList<>();
        list.add(new Workers("王二",32,3000.05));
        list.add(new Workers("王二",31,3000.04));
        list.add(new Workers("王二",31,3000.06));
        //Collections里面的取最大值或最小值的排序规则只能是升序
        Workers workers1 = Collections.max(list,((o1, o2) -> {
            return o2.getSalary() - o1.getSalary() >= 0 ? (o2.getSalary() - o1.getSalary() == 0 ? 0 : 1 ): -1;

        }));
        System.out.println(workers1);
        Collections.binarySearch(list,workers1);
//        for (Workers workers : list) {
//            System.out.println(workers);
//        }
    }
}

package com.learn.entity;

import java.util.ArrayList;
import java.util.List;

public class FoodsService {
    public static List<Foods> foodsList = new ArrayList<>();
    static {
        foodsList.add(new Foods("小熊饼干",5,0.5,6));
        foodsList.add(new Foods("辣条",1,0.5,7));
    }
    public static void sortByPrice() {
        foodsList.sort(((o1, o2) -> o1.getPrice() - o2.getPrice() > 0 ? o1.getPrice() - o2.getPrice() == 0 ? 0 : 1 : -1));
    }

    public static void sortByWeigh() {
        foodsList.sort(((o1, o2) -> o1.getWeight() - o2.getWeight() > 0 ? o1.getWeight() - o2.getWeight() == 0 ? 0 : 1 : -1));
    }

    public static void sortByShelfLife() {
        foodsList.sort(((o1, o2) -> o1.getShelfLife() - o2.getShelfLife() > 0 ? o1.getShelfLife() - o2.getShelfLife() == 0 ? 0 : 1 : -1));
    }
}

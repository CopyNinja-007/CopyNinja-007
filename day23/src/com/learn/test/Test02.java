package com.learn.test;

import com.learn.entity.Foods;
import com.learn.entity.FoodsService;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择排序方式：1.价格 2.重量 3.保质期");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                FoodsService.sortByPrice();
                break;
            case 2:
                FoodsService.sortByWeigh();
                break;
            case 3:
                FoodsService.sortByShelfLife();
                break;
        }
        for (Foods foods : FoodsService.foodsList) {
            System.out.println(foods);
        }

    }
}


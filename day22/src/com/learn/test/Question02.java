package com.learn.test;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/4/5 9:20
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
//2：对数组int[] array={10,90.8,9,100} 排序（使用冒泡排序） （10分）
public class Question02 {
    public static void main(String[] args) {
        int[] array = {10,90,8,9,100};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for (int i : array) {
            System.out.println(i);
        }
    }
}

package com.learn.test;

public class Test {
    public static void main(String[] args) {
        int[] nums = new int[]{32,6,5,21,34,56,46,11};
        Test.sleepSort(nums);
    }

    public  static void sleepSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            final int num = nums[i];
            new Thread(() -> {
                try {
                    Thread.sleep(num);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print(Thread.currentThread().toString() + "-------------------->");
                System.out.println(num);
            }).start();
        }
    }

}

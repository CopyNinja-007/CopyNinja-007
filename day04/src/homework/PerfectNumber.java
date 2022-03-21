package homework;

import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/10 16:36
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("请输入一个整数：");
        int num = scanner.nextInt();
        for (int i = 1; i < num; i++) {
            if (num%i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            System.out.println(num + "是完美数");
        }


    }
}
//        for(int num = 1; num <= 1000; num++ ) {
//            int sum = 0;
//            for (int i = 1; i < num; i++) {
//                if (num % i == 0) {
//                    sum += i;
//                }
//            }
//            if (sum == num) {
//                System.out.println(num + "是完美数");
//            }
//        }
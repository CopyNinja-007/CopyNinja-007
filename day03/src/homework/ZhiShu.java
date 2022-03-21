package homework;

import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/9 16:18
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class ZhiShu {
    public static void main(String[] args) {
        System.out.println("0~100之间的素数：");
        for (int i = 2; i <= 100; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if ( i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(i + "\t");
            }
        }
    }
}

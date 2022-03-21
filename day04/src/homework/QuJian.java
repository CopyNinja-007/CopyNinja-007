package homework;

import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/10 18:36
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class QuJian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int min = 0;
        System.out.println("请输入一个区间：");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            max = num1;
            min = num2;
        }else if (num1 < num2){
            max = num2;
            min = num1;
        }else {
            max = num1;
            min = num2;
        }
        for (int i = min; i <= max; i++) {
            if (i%3 == 0) {
                System.out.println("区间能够被3整除的第一个数字：");
                System.out.println(i);
                System.out.println("查找结束");
                System.exit(0);
            }
        }
        System.out.println("抱歉，没有能被3整除的数字！");
        System.out.println("查找结束");
    }
}

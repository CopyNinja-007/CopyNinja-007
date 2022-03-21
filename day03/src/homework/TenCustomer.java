package homework;

import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/9 13:58
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class TenCustomer {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int sum = 0;
        int lt30 = 0;
        int gt30 = 0;
        for (int i = 1; i < 11; i++) {
            System.out.println("请输入第" + i + "位客户的年龄：");
            int age = scanner.nextInt();
            if (age > 30) {
                gt30++;
            }else if (age < 30) {
                lt30++;
            }
        }

        System.out.println("大于30：小于30  =  " + gt30 + ":" + lt30 + "=" + (double)gt30/lt30);

    }
}

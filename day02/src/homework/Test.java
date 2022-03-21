package homework;

import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/8 10:27
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Test {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("请输入Java成绩：");
        double javaScore = scanner.nextDouble();
        System.out.println("请输入音乐成绩：");
        double musicScore = scanner.nextDouble();
        if ((javaScore > 90 && musicScore > 80) || (javaScore == 100 && musicScore > 70)) {
            System.out.println("老师奖励他一本《五年高考三年模拟》");
        }
    }
}

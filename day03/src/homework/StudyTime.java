package homework;

import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/9 13:34
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class StudyTime {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double sum = 0;
        double avg = 0;
        for (int i = 1; i < 6; i++) {
            System.out.print("请输入周" + i +"的学习时间（单位：小时）：");
            sum += scanner.nextDouble();
        }
        avg = sum / 5;
        System.out.println("平均每日学习时间是：" + avg + "h");
    }
}

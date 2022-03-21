package homework;

import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/16 10:45
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Question02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入存款：");
        double money = scanner.nextDouble();
        System.out.println("请输入房子数量：");
        int houseNum = scanner.nextInt();
        System.out.println(money > 2000000 && houseNum > 3 ? "可以在家睡觉了" : "好好学习，天天向上");
    }
}

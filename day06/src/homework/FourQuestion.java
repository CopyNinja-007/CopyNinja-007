package homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/14 13:57
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class FourQuestion {
    public static void main(String[] args) {
        int[] score = {78,89,90,88,29};
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int[] score2 = Arrays.copyOf(score,score.length+2);
        for (int i = 1; i <= 2; i++) {
            System.out.println("班级里面转来了两位新生，请输入第"+i+"位新生的成绩：");
            score2[score2.length-i] = scanner.nextInt();
        }
        for (int i : score2) {
            sum+=i;
        }
        System.out.println("总分为：" + sum);
    }
}
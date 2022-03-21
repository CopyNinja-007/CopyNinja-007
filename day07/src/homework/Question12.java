package homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/16 11:26
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Question12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double[] scoreArray = new double[10];
        for (int i = 0; i < scoreArray.length; i++) {
            System.out.println("请输入第"+(i+1)+"个同学的成绩：");
            scoreArray[i] = scanner.nextDouble();
        }
        for (int i = 0; i < scoreArray.length; i++) {
            sum += scoreArray[i];
        }
        Arrays.sort(scoreArray);
        System.out.println("平均分为：" + sum/scoreArray.length);
        System.out.println("最高分为：" + scoreArray[scoreArray.length-1]);
    }
}

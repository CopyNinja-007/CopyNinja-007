package homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/14 11:04
 * @description:
 * @modified By:
 * @version: 1.0.0
 */

public class OneQuestion {
    public static void main(String[] args) {
        double[] a = new double[5];
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("请输入第"+(i+1)+"位同学的成绩：");
            a[i] = scanner.nextDouble();
            sum+=a[i];
        }

        Arrays.sort(a);
        System.out.println("最高成绩为：" + a[a.length-1]);
        System.out.println("最低成绩为：" + a[0]);
        System.out.println("平均成绩为：" + sum/a.length);
    }
}

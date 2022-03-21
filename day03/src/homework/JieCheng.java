package homework;

import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/9 14:10
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class JieCheng {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 1;
        System.out.print("请输入需要阶乘的正整数：");
        int num = scanner.nextInt();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(num);
        stringBuilder.append("=");
        for (int i = 1; i <= num; i++) {
            stringBuilder.append(i);
            if (i != num) {
                stringBuilder.append("*");
            }else {
                stringBuilder.append("=");
            }
            result *= i;
        }
        stringBuilder.append(result);
        System.out.println(stringBuilder);
    }
}

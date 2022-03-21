package homework;

import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/10 18:04
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
//编写Java程序， 在控制台输入数字n
// 计算表达式1-2+3-4……+(2*n-1)-2*n的结果。
public class JiSuan {
    public static void main(String[] args) {
        int result = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请任意输入一个数字：");
        int num = scanner.nextInt();
        num = num*2;
        for(int i = 2; i <= num;i++) {
            if (i%2 == 0) {
                result -= i;
            }else{
                result += i;
            }
        }
        System.out.println(result);

    }
}

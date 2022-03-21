package homework;

import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/8 14:21
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Buy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的余额(单位：万)：" );
        double balance = scanner.nextDouble();
        if (balance > 500) {
            System.out.println("买凯迪拉克");
        }else if (balance > 100) {
            System.out.println("买帕萨特");
        }else if (balance > 50) {
            System.out.println("买伊兰特");
        }else if (balance > 10) {
            System.out.println("买奥托");
        }else if (balance < 10) {
            System.out.println("买捷安特");
        }
    }
}

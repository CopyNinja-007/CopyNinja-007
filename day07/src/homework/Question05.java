package homework;

import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/16 10:58
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Question05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入温度：");
        double wenDu = scanner.nextDouble();
        if (wenDu > 40) {
            System.out.println("大家都熟了");
        }else if (wenDu > 30) {
            System.out.println("我们只要空调、西瓜和WIFI");
        }else if (wenDu > 20) {
            System.out.println("天气凉，可以浪");
        }else {
            System.out.println("多穿衣服，免得感冒");
        }

    }
}

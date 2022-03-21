package homework;

import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/16 10:56
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Question04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入手机价格");
        double phonePrice = scanner.nextDouble();
        System.out.println(phonePrice > 5000 ? "买iphone" : "Android手机也行");
    }
}
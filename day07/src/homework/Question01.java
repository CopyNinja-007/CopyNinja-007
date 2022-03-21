package homework;

import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/16 10:39
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Question01 {
    public static void main(String[] args) {
        int age = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年龄：");
        age = scanner.nextInt();
        String name = age > 35 ? "老王" : "小王";
        System.out.println(name);
    }
}

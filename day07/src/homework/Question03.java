package homework;

import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/16 10:49
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Question03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎使用银行电话服务：1.银行卡业务；2.信用卡业务；3.业务咨询；4.人工服务;其它数字-挂机");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("银行卡业务");
                break;
            case 2:
                System.out.println("信用卡业务");
                break;
            case 3:
                System.out.println("业务咨询");
                break;
            case 4:
                System.out.println("人工服务");
                break;
            default:
                System.out.println("挂机");
        }
    }
}

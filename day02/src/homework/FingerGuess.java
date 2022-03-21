package homework;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/8 11:09
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class FingerGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 2;
        int b = 2;
        //控制输入数字大小
        do {
            if ((a <= 3 && a >= 1) && (b <= 3 && b >= 1)) {
                System.out.println("请输入A出的拳,1代表剪刀，2代表石头，3代表布");
                a = scanner.nextInt();
                System.out.println("请输入B出的拳,1代表剪刀，2代表石头，3代表布");
                b = scanner.nextInt();
            } else {
                System.out.println("输入错误请重新输入！");
                System.out.println("请输入A出的拳,1代表剪刀，2代表石头，3代表布");
                a = scanner.nextInt();
                System.out.println("请输入B出的拳,1代表剪刀，2代表石头，3代表布");
                b = scanner.nextInt();
            }
        } while((a > 3 || a < 1) || (b > 3 || b < 1));


        if(a == 1 && b == 2) {
            System.out.println("b赢了");
        }else if (a == 1 && b == 3) {
            System.out.println("a赢了");
        }else if (a == 2 && b == 1) {
            System.out.println("a赢了");
        }else if (a == 2 && b == 3) {
            System.out.println("b赢了");
        }else if (a ==3 && b == 1) {
            System.out.println("b赢了");
        }else if (a == 3 && b == 2) {
            System.out.println("ay赢了");
        }else {
            System.out.println("平局");
        }
    }
}

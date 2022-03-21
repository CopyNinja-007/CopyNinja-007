package homework;

import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/8 15:00
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Point {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入会员积分：");
        int vipPoint = scanner.nextInt();
        if (vipPoint >= 8000) {
            System.out.println("该会员享受的折扣是：0.6");
        }else if (vipPoint >= 4000) {
            System.out.println("该会员享受的折扣是: 0.7");
        }else if (vipPoint >= 2000) {
            System.out.println("该会员享受的折扣是：0.8");
        }else if (vipPoint < 2000) {
            System.out.println("该会员享受的折扣是：0.9");
        }
    }
}

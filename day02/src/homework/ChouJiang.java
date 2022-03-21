package homework;

import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/8 14:03
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class ChouJiang {
    public static void main(String[] args) {
        int vipNum = 4;
        Scanner scanner = new Scanner(System.in);
        System.out.println("我行我素购物管理系统 > 幸运抽奖");
        System.out.print("请输入4位会员号：");
        int cardNum = scanner.nextInt();
        int result = (cardNum / 100) % 10;
        if (result == vipNum) {
            System.out.println(cardNum + "号客户是幸运客户，获得精美的MP3一个。");
        } else
            System.out.println(cardNum + "号客户，感谢您的支持！");
    }
}

package homework;

import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/14 11:40
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class TwoQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] commodity = new double[10];
        double price = 0;
        double sum = 0;
        for (int i = 0; i < commodity.length; i++) {
            System.out.println("请输入第件"+(i+1)+"商品的价格：");
            if(i==0) {
                commodity[i] = scanner.nextDouble();
            }else {
                price = scanner.nextDouble();
                while (price < commodity[i-1] * 0.7 || price > commodity[i-1] * 1.9) {
                    System.out.println("价格不在区间，请重新输入：");
                    price = scanner.nextDouble();
                }
                commodity[i] = price;
            }
        }
        for (double i : commodity) {
            sum += i;
        }

        System.out.println("平均价格为：" + sum/commodity.length);

    }
}

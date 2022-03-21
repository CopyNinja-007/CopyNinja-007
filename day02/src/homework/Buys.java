package homework;

import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/8 16:44
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Buys {
    public static void main(String[] args) {
        double radish = 6;
        double beef = 30;
        double cabbage = 5;
        double price = 0;
        int index = 1;
        double kg1 = 0;
        double kg2 = 0;
        double kg3 = 0;
        double cutPrice = 0;
        Scanner scanner = new Scanner(System.in);
        while(index > 0 && index < 4){
            System.out.println("请输入购买的商品：1-萝卜，2-牛肉，3-白菜,4-结算");
            index = scanner.nextInt();
            if (index == 1) {
                System.out.println("请输入重量（单位：kg）：");
                kg1 += scanner.nextDouble();
            } else if (index == 2) {
                System.out.println("请输入重量（单位：kg）：");
                kg2 += scanner.nextDouble();
            } else if (index == 3) {
                System.out.println("请输入重量（单位：kg）：");
                kg3 += scanner.nextDouble();
            }
        }

        if (index == 4) {
            price = (kg1 * radish) + (kg2 *beef) + (kg3 *cabbage);
            if (price > 300) {
                cutPrice = price * 0.85;
            } else if (price >= 200) {
                cutPrice = price * 0.88;
            } else if (price >= 100) {
                cutPrice = price * 0.95;
            }

            System.out.println("萝卜" +'\t' + "牛肉" + '\t' + "白菜");
            System.out.println(radish + "/kg" + '\t' + beef + "/kg" + '\t' + cabbage + "/kg" + '\t');
            System.out.println(kg1 + "kg" + '\t' + kg2 + "kg" + '\t' + kg3 + "kg" + '\t');
            System.out.println("折前价：" + price + "元");
            System.out.println("折后价：" + cutPrice + "元");
        }

    }
}

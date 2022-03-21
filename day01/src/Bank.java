import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/7 15:03
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入存钱金额：");
        double money = scanner.nextDouble();
        System.out.println("请选择存期年数：1.一年，2.两年， 3.三年，4.五年");
        int years = scanner.nextInt();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("银行应该支付的本金为：");
        stringBuilder.append(money);
        switch (years) {
            case 1:
                stringBuilder.append("存取一年后的本息为：");
                stringBuilder.append(money + (money * 0.0225) * 1);
                System.out.println(stringBuilder);
                break;
            case 2:
                stringBuilder.append("存取两年后的本息为：");
                stringBuilder.append(money + (money * 0.027) * 2);
                System.out.println(stringBuilder);
                break;
            case 3:
                stringBuilder.append("存取三年后的本息为：");
                stringBuilder.append(money + (money * 0.0324) * 3);
                System.out.println(stringBuilder);
                break;
            case 4:
                stringBuilder.append("存取五年后的本息为：");
                stringBuilder.append(money + (money * 0.036) * 5);
                System.out.println(stringBuilder);
                break;
            default:
                System.out.println("该银行不支持所输入存期");
        }

    }
}

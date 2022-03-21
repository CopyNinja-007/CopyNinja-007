import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/7 13:44
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Vip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //中奖号码：81；
        int num = 81;
        System.out.println("请输入会员卡号：");
        int vipCard = scanner.nextInt();
        int sum = 0;
        System.out.println("会员卡号是：" + vipCard);
        for(int i = vipCard;i > 0 ; i/=10) {
            if (i > 9) {
                int result = i % 10;
                sum+=result;
            } else {
                sum+=i;
            }
        }
        System.out.println("会员卡号" + vipCard + "各位之和：" + sum);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("会员卡号"+vipCard+"的会员，");
        switch (sum) {
            case 10 :
                stringBuilder.append("恭喜您中奖了，奖品是MP3");
                System.out.println(stringBuilder);
                break;
            case 20 :
                stringBuilder.append("恭喜您中奖了，奖品是ps4");
                System.out.println(stringBuilder);
                break;
            case 30 :
                stringBuilder.append("恭喜您中奖了，奖品是《格林童话》");
                System.out.println(stringBuilder);
                break;
            default :
                stringBuilder.append("很遗憾！您与奖品擦肩而过");
                System.out.println(stringBuilder);
        }

    }
}
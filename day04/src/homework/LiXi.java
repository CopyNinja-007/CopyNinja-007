package homework;


/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/10 16:57
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class LiXi {
    public static void main(String[] args) {
        double money = 10000;
        while(money <= 12000) {
            money+=money * 0.03;
        }
        double sum = money - 10000;
        System.out.println(sum);
    }
}

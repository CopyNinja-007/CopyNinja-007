package homework;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/10 16:44
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class ShuiXianFlower {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 100; i < 1000; i++) {
            int ge = i%10;
            int shi = i/10%10;
            int bai = i/100;
            if((ge*ge*ge) + (shi*shi*shi) + (bai*bai*bai) == i) {
                System.out.println(i);
            }
        }
    }
}

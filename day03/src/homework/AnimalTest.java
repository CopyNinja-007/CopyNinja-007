package homework;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/9 12:13
 * @description:
 * @modified By:
 * @version: 1.0.0
 */

public class AnimalTest {
    public static void main(String[] args) {
        int chicken = 0;
        int rabbit = 0;
        int head = 35;
        int foot = 94;
        for (int i = rabbit; i <= head; i++) {
            for (int j = chicken; j <= head; j++) {
                if ((j * 2 + i * 4) == foot && i + j == head) {
                    rabbit = i;
                    chicken = j;
                }
            }
        }
        System.out.println("兔子：" + rabbit);
        System.out.println("鸡：" + chicken);
    }
}


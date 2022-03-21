package homework;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/10 19:13
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class SumTest {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            if (i/10%10 == 3 || i%10 ==3) {
                continue;
            }
            sum += i;
        }
        System.out.println(sum);
    }
}

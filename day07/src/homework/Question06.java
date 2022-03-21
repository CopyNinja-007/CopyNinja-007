package homework;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/16 11:02
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Question06 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            if (i%2 != 0) {
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}

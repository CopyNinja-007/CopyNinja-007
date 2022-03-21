package homework;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/9 13:41
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class SumTest {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 101 ; i++) {
            if (i%7 != 0) {
                sum += i;
            }
        }
        System.out.println("1~100之间不能被7整除的数的和为：" + sum);
    }
}

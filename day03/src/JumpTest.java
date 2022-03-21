

import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/9 9:11
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class JumpTest {
    public static void main(String[] args) {
        int n=1, i;
        while (n <= 100) {
            if (n == 1) {
                System.out.println(n + "不是质数");
                n++;
                continue;
            }
            for (i = 2; i < n; i++) {
                if (n%i==0) {
                    break;
                }
            }
            if (n == i) {
                System.out.println(n + "是质数");
            }else {
                System.out.println(n + "不是质数");
            }
            n++;
        }
    }
}

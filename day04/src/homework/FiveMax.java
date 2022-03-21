package homework;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/10 19:29
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
//编写Java程序，输出1～100之间能够同时被3和4整除的最大的五个数字。
public class FiveMax {
    public static void main(String[] args) {
        System.out.println("1～100之间能够同时被3和4整除的最大的五个数字：");
        int index = 0;
        for (int i = 100; i > 0; i--) {
            if ((i%3 == 0) && (i%4 == 0)) {
                System.out.println(i);
                index++;
            }
            if (index == 5) {
                break;
            }
        }
    }
}

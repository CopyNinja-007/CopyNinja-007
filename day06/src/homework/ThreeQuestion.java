package homework;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/14 13:47
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class ThreeQuestion {
    public static void main(String[] args) {
        double[] array = {78,89,90,88,29,66,44,22};
        int lt60 = 0;
        for (double i : array) {
            if (i < 60) {
                i=i*1.2;
                if (i < 60) {
                    lt60++;
                }
            }
        }
        System.out.println((double) lt60 / array.length);
    }
}

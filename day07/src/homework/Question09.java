package homework;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/16 11:15
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Question09 {
    public static void main(String[] args) {
        int[] array = {12,23,4,342,44};
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println(sum);
    }
}

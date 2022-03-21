package homework;

import java.util.Arrays;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/16 11:49
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Question14 {
    public static void main(String[] args) {
        int[] array = {12,324,43,34,2,33,444,55,32,23};
        Arrays.sort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }
}

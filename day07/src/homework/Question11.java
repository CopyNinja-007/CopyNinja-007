package homework;

import java.util.Arrays;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/16 11:25
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Question11 {
    public static void main(String[] args) {
        int[] array = new int[] {12,23,4,3,5};
        Arrays.sort(array);
        System.out.println(array[array.length - 1]);
    }
}

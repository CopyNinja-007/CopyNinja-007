package homework;

import java.util.Arrays;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/17 14:07
 * @description:定义输出最大值的方法
 * @modified By:
 * @version: 1.0.0
 */
public class Question02 {
    public static void main(String[] args) {
        int[] array = {324,43,23,12,43,5,4,3,322,33};
        System.out.println(getMaxNum(array));
    }

    public static int getMaxNum(int[] array) {
        Arrays.sort(array);
        return array[array.length-1];
    }
}

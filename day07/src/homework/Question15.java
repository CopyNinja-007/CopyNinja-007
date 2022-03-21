package homework;

import java.util.Arrays;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/16 12:14
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Question15 {
    public static void main(String[] args) {
        int ji = 0;
        int ou = 0;
        int[] array = {12,324,43,34,2,33,444,55,32,23};
        Arrays.sort(array);
        for (int i : array) {
            if (i%2==0) {
                ou++;
            }else {
                ji++;
            }
        }

        System.out.println("最大值为：" + array[array.length-1]);
        System.out.println("最小值为：" + array[0]);
        System.out.println("奇数的个数为：" + ji);
        System.out.println("偶数的个数为：" + ou);
    }
}

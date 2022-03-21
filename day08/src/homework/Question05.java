package homework;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/17 14:44
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Question05 {
    public static void main(String[] args) {
        int[] array = {324,43,23,12,43,5,4,3,322,33};
        System.out.println(find(array, 12));
    }
    public static int find(int[] array,int key) {
        Arrays.sort(array);
        int start = 0;
        int end = array.length - 1;
        while(start <= end) {
            int mid = (start + end) >>> 1;
            int midVal = array[mid];
            if (midVal > key) {
                end = mid - 1;
            }else if (midVal < key) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -(start + 1);
    }
}



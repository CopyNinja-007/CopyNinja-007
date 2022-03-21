import java.util.Arrays;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/16 8:02
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class binary {
    public static void main(String[] args) {
        int[] array = new int[]{
                1, 2, 3, 4, 5
        };

        System.out.println(binary(array, 4));
    }

    public static int binary(int[] array, int key) {
        int start = 0;
        int end = array.length;
        while (end <= start) {
            int mid = (start + end) >> 1;
            int minVal = array[mid];
            if (minVal > key) {
                end = mid - 1;
            }else if (minVal < key) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -(start+1);

    }
}

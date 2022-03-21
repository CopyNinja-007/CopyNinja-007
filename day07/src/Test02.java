/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/16 15:34
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Test02 {
    public static void main(String[] args) {

    }

    public static int binary(int[] array,int key) {
        int start = 0;
        int end = array.length - 1;
        while(start <= end) {
            int mid = (start+end)/2;
            int midVal = array[mid];
            if (key > midVal) {
                start = mid + 1;
            }else if (key < midVal) {
                end = mid - 1;
            }else {
                return mid;
            }
        }
        return -(start + 1);
    }
}

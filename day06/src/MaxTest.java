import java.util.Arrays;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/14 9:42
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class MaxTest {
    public static void main(String[] args) {
        int[] array = {12,34,56,17,89};
        array = Arrays.copyOf(array,10);
        System.out.println(array.length);
        for (int i :
                array) {
            System.out.println(i);
        }
    }
}

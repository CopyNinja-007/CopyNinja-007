import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/14 10:27
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class ArrayTest01 {
    public static void main(String[] args) {
        int[] array = {99,98,89,63,60,0};
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (score >= array[i]) {
                index = i;
                break;
            }
        }
        for (int i = array.length-2; i >= index ; i--) {
            array[i+1] = array[i];
        }

        array[index] = score;

        for (int i :
                array) {
            System.out.println(i);
        }
    }
}

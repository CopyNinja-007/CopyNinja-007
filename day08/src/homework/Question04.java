package homework;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/17 14:23
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Question04 {
    public static void main(String[] args) {
        int[] array = {324,32,44,31,2,44,55,33,2};
        sortArray(array);
        for (int i: array) {
            System.out.println(i);
        }
    }

    private static void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j+1] < array[j]) {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}

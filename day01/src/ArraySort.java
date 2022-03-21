import java.util.Arrays;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/7 19:18
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class ArraySort {
    public static void main(String[] args) {
        int[][] array = new int[10][4];
        //遍历数组方法一：
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                System.out.println(array[i][j]);
            }

        }

    }

}

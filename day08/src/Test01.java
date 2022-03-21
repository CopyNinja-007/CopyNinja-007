import java.util.Arrays;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/17 9:24
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Test01 {
    //Integer常量池范围-128~127
    public static void main(String[] args) {
        int[][] array = new int[1][3];
        array = Arrays.copyOf(array,10);
        System.out.println(array.length + "");
    }
}

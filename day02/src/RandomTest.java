import java.util.Random;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/8 9:55
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();
        //随机生成0-1的随机数字；
        int i = random.nextInt(2);
        System.out.println(i);
    }
}

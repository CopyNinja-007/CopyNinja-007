package homework;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/9 13:53
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class FlipFlop {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (i%3 == 0) {
                System.out.println(i + "----------->" + "Flip");
            }else
                System.out.println(i + "----------->" + "FlipFlop");
        }
    }
}

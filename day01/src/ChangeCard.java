/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/7 14:49
 * @description:变量数据交换
 * @modified By:
 * @version: 1.0.0
 */
public class ChangeCard {
    public static void main(String[] args) {
        int blackPeach = 10;
        int redHeart = 8;
        //需要一个临时变量；
        int temp;
        temp = blackPeach;
        blackPeach = redHeart;
        redHeart = temp;
        System.out.println(blackPeach);
        System.out.println(redHeart);

    }
}

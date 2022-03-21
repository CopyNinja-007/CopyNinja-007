/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/9 10:48
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class JiOu {
    public static void main(String[] args) {
        int i = 1;
        do {
            if (i % 2 == 0) {
                System.out.println(i + "是偶数");
            }else {
                System.out.println(i + "是奇数");
            }
            i++;
        }while(i < 101);
    }
}

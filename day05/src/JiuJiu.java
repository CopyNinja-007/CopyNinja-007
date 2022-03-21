/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/11 9:10
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class JiuJiu {
    public static void main(String[] args) {
        for (int i = 1; i <= 9 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j*i);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}

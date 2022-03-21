/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/7 19:35
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class JiuJiu {
    public static void main(String[] args) {
        for(int i = 1; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print(i +"*"+j+"="+(j*i));
                System.out.print('\t');
            }
            System.out.println();
        }
    }
}

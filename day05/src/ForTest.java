/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/11 9:53
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class ForTest {
    public static void main(String[] args) {
//        for (int i = 5; i >= 1 ; i--) {
//            for (int j = i-1; j >= 1 ; j--){
//                System.out.print(" ");
//            }
//            for (int k = 0; k < 6; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < 5+i; j++) {
                //i=0 j=01234
                if(j <= 5-i) {
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}

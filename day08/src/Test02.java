/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/17 10:18
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Test02 {
    public static void main(String[] args) {
        Animal animal = sayHello();
        System.out.println();
    }
    public static Dog sayHello(int... args) {
        for (int i = 0; i < 100; i++) {
            System.out.println("好好学习，天天向上");
        }
        return new Dog();
    }
}

class Animal {

}

class Dog extends Animal{

}

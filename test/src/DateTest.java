/**
 * @author: 谢绍亮
 * @date: Created in 2022/4/5 19:09
 * @description:
 * @modified By:
 * @version: 1.0.0
 */

public class DateTest {
    public static void main(String[] args) {
        Cat cat = new Cat();

    }
}

class Cat {
    private String name;
    private int age;
    private String sex;

    public Cat() {
    }

    public Cat(String name) {
        this(name,0);
    }

    public Cat(String name, int age) {
        this(name,age,"");
    }

    public Cat(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}

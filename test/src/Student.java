import java.util.List;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/29 19:07
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Student<T> {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void forEach(List<T> list) {
        for (T t : list) {
            System.out.println(t);
        }
    }
}

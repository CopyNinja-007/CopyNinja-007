package com.learn.test;

import java.util.*;


/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/28 8:12
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Test01 {
    public static void main(String[] args) {
        Integer[] array1 = {1,2,4,5,6,5};
        Arrays.stream(array1)
                .distinct()
                .filter(array -> array == 1)
                .map(array -> array1.toString())
                .forEach(System.out::println);

    }

}

class Car{
    public String chePai;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(chePai, car.chePai);
    }

    @Override
    public String toString() {
        return "Car{" +
                "chePai='" + chePai + '\'' +
                '}';
    }

    public Car(String chePai) {
        this.chePai=chePai;
    }
}

@FunctionalInterface
interface A {
    void doSome(int i,int b);
}

class Pen {
    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getAge() {
        return 1;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Pen(String name) {
        this.name = name;
    }
    public Pen(){}
    public Pen(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public  void doSome() {
        System.out.println("pen的dosome方法执行了");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pen)) return false;
        Pen pen = (Pen) o;
        return Objects.equals(name, pen.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Pen{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void add() {
        System.out.println("静态方法");
    }

}


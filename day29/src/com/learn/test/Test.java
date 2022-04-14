package com.learn.test;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws Exception {
        Class className = Class.forName("com.learn.model.Company");
        Object o = className.getDeclaredConstructor(int.class,String.class,String.class).newInstance(1,"阿里","杭州");
        System.out.println(o);
        Field[] declaredFields = className.getDeclaredFields();
        declaredFields[0].getModifiers();
    }
}

package com.learn.test;

import com.learn.model.Company;
import sun.security.provider.MD5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test03 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException {
        Class className = Class.forName("com.learn.model.Company");
        try {
            Company company = (Company)className.newInstance();
            Method setName = className.getDeclaredMethod("setName", String.class);
            setName.invoke(company,"张三");
            System.out.println(company.getName());
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

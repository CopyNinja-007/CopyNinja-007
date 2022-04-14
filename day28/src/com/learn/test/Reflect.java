package com.learn.test;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Properties;

public class Reflect {
    public static void main(String[] args) {
        Properties properties = new Properties();
        FileReader in = null;
        try {
            in = new FileReader("day28/src/com/learn/test/classPath.properties");
            properties.load(in);
            String value = properties.getProperty("Company");
            String targetPath = properties.getProperty("targetPath");
            String content = reflect(value);
            writeClass(content,targetPath);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void writeClass(String content,String targetPath) {
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(targetPath);
            out.write(content.getBytes());
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static String reflect(String classPath) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            Class className = Class.forName(classPath);
            stringBuffer.append("类名:")
                    .append(className)
                    .append("\n")
                    .append("------------")
                    .append("属性")
                    .append("------------")
                    .append("\n");
            Field[] declaredFields = className.getDeclaredFields();
            for (Field field: declaredFields) {
                stringBuffer.append(Modifier.toString(field.getModifiers())).append("\t")
                        .append(field.getType().getSimpleName())
                        .append("\t").
                        append(field.getName())
                        .append("\n");
            }
            stringBuffer.append("------------")
                    .append("方法")
                    .append("------------")
                    .append("\n");
            Method[] declaredMethods = className.getDeclaredMethods();
            for (int i = 0; i < declaredMethods.length; i++) {
                Method methods = declaredMethods[i];
                stringBuffer.append(Modifier.toString(methods.getModifiers()))
                        .append("\t")
                        .append(methods.getReturnType().getSimpleName())
                        .append("\t")
                        .append(methods.getName())
                        .append("(");
                Class<?>[] parameterTypes = methods.getParameterTypes();
                for (int j = 0; j < parameterTypes.length; j++) {
                    stringBuffer.append(parameterTypes[j].getSimpleName());
                    if (!(j == parameterTypes.length - 1)) {
                        stringBuffer.append(",").append(" ");
                    }
                }
                stringBuffer.append(")")
                        .append("\n");
            }
            stringBuffer.append("----------")
                    .append("构造方法")
                    .append("----------")
                    .append("\n");
            Constructor[] declaredConstructors = className.getDeclaredConstructors();
            for (int i = 0; i < declaredConstructors.length; i++) {
                Constructor constructor = declaredConstructors[i];
                stringBuffer.append(Modifier.toString(constructor.getModifiers()))
                        .append("\t")
                        .append(className.getSimpleName())
                        .append("(");
                Class[] parameterTypes = constructor.getParameterTypes();
                for (int j = 0; j < parameterTypes.length; j++) {
                    stringBuffer.append(parameterTypes[j].getSimpleName());
                    if (!(j == parameterTypes.length - 1)) {
                        stringBuffer.append(",").append(" ");
                    }
                }
                stringBuffer.append(")")
                        .append("\n");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return stringBuffer.toString();
    }
}

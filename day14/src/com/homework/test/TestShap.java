package com.homework.test;

import com.homework.model.Circle;
import com.homework.model.Rectangle;
import com.homework.model.Shap;
import com.homework.model.Square;

import java.util.Arrays;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/25 14:21
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class TestShap {
    public static void main(String[] args) {
        Shap shap = new Circle(4);
        System.out.println(shap.getArea());
        System.out.println(shap.getPerimeter());
        shap = new Rectangle(4,3);
        System.out.println(shap.getArea());
        System.out.println(shap.getPerimeter());
        shap = new Square(4);
        System.out.println(shap.getPerimeter());
        System.out.println(shap.getArea());
        shap.getPerimeter();
    }
}

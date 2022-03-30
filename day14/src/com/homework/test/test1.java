package com.homework.test;


import com.homework.model.quesiton5.Circle;
import com.homework.model.quesiton5.Shap;
import com.homework.model.quesiton5.Square;

public class test1 {
    public static void main(String[] args) {
        Shap shap=new Circle();
        System.out.println(shap.getArea(3));
        System.out.println(shap.getPerimeter(3));


        Shap shap1=new Square();
        System.out.println(shap1.getArea(2));
        System.out.println(shap1.getPerimeter(2));

    }
}

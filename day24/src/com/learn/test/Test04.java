package com.learn.test;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.stream.Collectors;


public class Test04 {
    public static void main(String[] args) {
        String s = "Good>Good>Study>Day>Day>Up";
        String[] split = s.split(">");
        Set<String> list = new LinkedHashSet<>(Arrays.asList(split));
        System.out.println(String.join("<", list));

    }
}

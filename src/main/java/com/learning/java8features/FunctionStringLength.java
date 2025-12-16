package com.learning.java8features;

import java.util.function.Function;

public class FunctionStringLength {
    public static void main(String[] args) {
        Function<String, Integer> func = s -> s.length();
        System.out.println(func.apply("Vishal"));
        System.out.println(func.apply("Myra"));
        System.out.println(func.apply("Naina"));
    }
}

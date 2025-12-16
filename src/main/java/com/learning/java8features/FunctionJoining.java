package com.learning.java8features;

import java.util.function.Function;

public class FunctionJoining {
    public static void main(String[] args) {
        Function<Integer, Integer> func1 = i -> 2 * i;
        Function<Integer, Integer> func2 = i -> i * i * i;
        System.out.println(func1.andThen(func2).apply(2));
        System.out.println(func1.compose(func2).apply(2));
    }
}

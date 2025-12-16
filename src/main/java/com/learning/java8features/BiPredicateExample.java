package com.learning.java8features;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> bp = (a, b) -> (a + b) % 2 == 0;
        System.out.println(bp.test(10, 15));
        System.out.println(bp.test(10, 10));
    }
}

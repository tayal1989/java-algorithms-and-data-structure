package com.learning.java8features;

import java.util.function.Predicate;

public class EvenNumberPredicate {
    public static void main(String[] args) {
        Predicate<Integer> p1 = i -> i % 2 == 0;

        for(int number = 0 ; number < 10 ; number++) {
            System.out.println(number + " is an even number : " + p1.test(number));
        }
    }
}

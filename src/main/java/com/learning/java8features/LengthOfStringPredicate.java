package com.learning.java8features;

import java.util.List;
import java.util.function.Predicate;

public class LengthOfStringPredicate {
    public static void main(String[] args) {
        String[] list = {"Vishal", "Naina", "Myra", "Himalaya", "Bimla"};
        Predicate<String> p1 = i -> i.length() > 5;
        for(int str = 0; str < list.length; str++) {
            System.out.println(list[str] + " : " + p1.test(list[str]));
        }

        Predicate<String> p2 = i -> i.length() % 2 == 0;
        for(int str = 0; str < list.length; str++) {
            System.out.println(list[str] + " : " + p2.test(list[str]));
        }
    }
}

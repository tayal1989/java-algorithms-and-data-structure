package com.learning.java8features;

import java.util.function.Predicate;

public class PredicateJoining {
    public static void main(String[] args) {
        int[] no = {5, 10, 15, 20, 25, 30};
        Predicate<Integer> p1 = i1 -> i1 % 2 == 0;
        Predicate<Integer> p2 = i2 -> i2 > 10;
        System.out.println("The no which are even and greater than 10 are : ");
        for(int i = 0; i < no.length; i++) {
            if(p1.and(p2).test(no[i])) {
                System.out.println(no[i]);
            }
        }

        System.out.println("The no which are even or greater than 10 are : ");
        for(int i = 0; i < no.length; i++) {
            if(p1.or(p2).test(no[i])) {
                System.out.println(no[i]);
            }
        }

        System.out.println("The no which are not even are : ");
        for(int i = 0; i < no.length; i++) {
            if(p1.negate().test(no[i])) {
                System.out.println(no[i]);
            }
        }
    }
}

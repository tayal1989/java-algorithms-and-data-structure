package com.learning.test;


// Java Program to convert
// Array to Set

import java.util.*;

public class GreaterThanZeroNotPresentInArray {
    public static void main(String[] args) {
        int A[] = {1, 3, 6, 4, 1, 2};
        int element = solution(A);
        System.out.println(element);
    }

    public static int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                set.add(A[i]);
            }
        }

        System.out.println(set);

        for (int i = 1; i <= A.length + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return 0;
    }

}

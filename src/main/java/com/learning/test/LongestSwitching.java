package com.learning.test;

public class LongestSwitching {
    public static void main(String[] args) {
        int[] arr1 = {3, 2, 3, 2, 3};
        int[] arr2 = {7, 4, -2, 4, -2, -9};
        int[] arr3 = {7, -5, -5, -5, 7, -1, 7};
        int[] arr4 = {4};
        System.out.println(solution(arr1));
        System.out.println(solution(arr2));
        System.out.println(solution(arr3));
        System.out.println(solution(arr4));
    }

    public static int solution(int[] A) {
        int longest = 0;
        if(A.length <= 2) {
            longest = A.length;
            return longest;
        } else {
            longest = 2;
            int temp = 2;
            for(int i = 2; i < A.length; ++i) {
                if(A[i] == A[i - 2]) {
                    temp = temp + 1;
                } else {
                    temp = 2;
                }
                longest = Math.max(temp, longest);
            }
            return longest;
        }
    }
}

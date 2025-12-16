package com.learning.test;

import java.util.Arrays;

public class MinNumberToMakeArrayEqual {
    public static void main(String args[]) {
        int arr1[] = {3, 2, 1, 1, 2, 3, 1};
        int arr2[] = {4, 1, 4, 1};
        int arr3[] = {3, 3, 3};
        System.out.println(solution(arr1));
        System.out.println(solution(arr2));
        System.out.println(solution(arr3));
    }

    public static int solution(int arr[]) {
        Arrays.sort(arr);
        int mid = arr[arr.length/2];
        int mid1 = arr[(arr.length/2) - 1];
        int res = 0, res1 = 0;
        for(int i = 0; i < arr.length; i++) {
            res = res +  Math.abs(arr[i] - mid);
            res1 = res1 + Math.abs(arr[i] - mid1);
        }
        return Math.min(res,res1);
    }
}

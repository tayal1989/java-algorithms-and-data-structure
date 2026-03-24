package com.learning.practise;

import java.util.Arrays;

public class MinPenaltyProblemDEShaw {

    public static void main(String[] args) {
        System.out.println(minimizeMax(new int[] {10, 0}, 3));
        System.out.println(minimizeMax(new int[] {2, 2, 2}, 5));
        System.out.println(minimizeMax(new int[] {9}, 2));
    }

    public static int minimizeMax(int[] arr, int k) {
        int left = 0;
        int right = Arrays.stream(arr).max().getAsInt();

        while (left < right) {
            int mid = (left + right) / 2;

            long ops = 0;
            for (int num : arr) {
                if (num > mid) {
                    ops += (num - mid);
                }
            }

            if (ops <= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}

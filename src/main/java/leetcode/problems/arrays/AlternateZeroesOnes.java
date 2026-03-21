package leetcode.problems.arrays;

import java.util.Arrays;

public class AlternateZeroesOnes {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findAlternateZeroOne(new int[] {1, 1, 0, 0})));
        System.out.println(Arrays.toString(findAlternateZeroOne(new int[] {1, 1, 0, 1, 0, 0})));
        System.out.println(Arrays.toString(findAlternateZeroOne(new int[] {1, 1, 1, 0})));
        System.out.println(Arrays.toString(findAlternateZeroOne(new int[] {0, 0, 0, 1})));
    }

    public static int[] findAlternateZeroOne(int[] arr) {
        int zeroes = 0;
        int ones = 0;

        for (int i : arr) {
            if (i == 0) {
                zeroes++;
            } else {
                ones++;
            }
        }

        int maxLength = Math.min(zeroes, ones) * 2;
        if (zeroes != ones) {
            maxLength++;
        }

        int current;

        if (zeroes > ones) {
            current = 0;
        } else if (ones > zeroes){
            current = 1;
        } else {
            current = arr[0];
        }

        for (int i = 0; i < arr.length; i++) {
            if (i < maxLength) {
                arr[i] = current;
                current = 1 - current;
            } else {
                if (zeroes > ones) {
                    arr[i] = 0;
                } else {
                    arr[i] = 1;
                }
            }
        }

        return arr;
    }
}

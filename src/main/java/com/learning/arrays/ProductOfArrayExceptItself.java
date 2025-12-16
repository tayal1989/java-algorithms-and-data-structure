package com.learning.arrays;

public class ProductOfArrayExceptItself {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] outputArr = new int[arr.length];
        int prod = 1;
        int count = 0;

        for (int start = 0; start < arr.length; start++) {
            for (int i = 0; i < arr.length; i++) {
                if (count != i) {
                    prod = prod * arr[i];
                }
            }
            outputArr[count] = prod;
            count++;
            prod = 1;
        }

        for (int i = 0; i < outputArr.length; i++) {
            System.out.print(outputArr[i] + " ");
        }
    }
}
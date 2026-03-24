package com.learning.stacks;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreaterElement(new int[] {4, 7, 3, 4, 8, 1})));
    }

//    public static int[] nextGreaterElement(int[] arr) {
//        for (int i = 0; i < arr.length - 1; i++) {
//            boolean flag = true;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] > arr[i]) {
//                    arr[i] = arr[j];
//                    flag = false;
//                    break;
//                }
//            }
//
//            if (flag) {
//                arr[i] = -1;
//            }
//        }
//
//        arr[arr.length - 1] = -1;
//
//        return arr;
//    }

    public static int[] nextGreaterElement(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                    stack.pop();
                }
            }

            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }

        return result;
    }
}

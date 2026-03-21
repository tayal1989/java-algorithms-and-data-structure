package leetcode.problems.arrays;

import java.util.Arrays;

public class NextGreaterElement {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreaterElement(new int[] {4, 7, 3, 4, 8, 1})));
    }

    public static int[] nextGreaterElement(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    arr[i] = arr[j];
                    flag = false;
                    break;
                }
            }

            if (flag) {
                arr[i] = -1;
            }
        }

        arr[arr.length - 1] = -1;

        return arr;
    }
}

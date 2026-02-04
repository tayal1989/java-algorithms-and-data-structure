package leetcode.problems.arrays;

import java.util.Arrays;

public class ProductOfNumberExceptSelf {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1,1,0,-3,3})));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] leftArr = new int[nums.length];
        int[] rightArr = new int[nums.length];

        leftArr[0] = 1;
        rightArr[nums.length - 1] = 1;

        for (int i = 1; i < nums.length; i++) {
            leftArr[i] = leftArr[i - 1] * nums[i - 1];
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            rightArr[i] = rightArr[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = leftArr[i] * rightArr[i];
        }

        return nums;
    }
}

package leetcode.problems.arrays;

import java.util.Arrays;

public class RunningSumOf1DArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[]{1,2,3,4})));
        System.out.println(Arrays.toString(runningSum(new int[]{1,1,1,1,1})));
        System.out.println(Arrays.toString(runningSum(new int[]{3,1,2,10,1})));
    }

    public static int[] runningSum(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int sum = nums[i] + nums[i + 1];
            nums[i + 1] = sum;
        }

        return nums;
    }
}

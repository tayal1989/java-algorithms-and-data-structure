package leetcode.problems.arrays;

import java.util.Arrays;

public class RunningSumArray {

    public static void main(String[] args) {
        RunningSumArray runningSumArray = new RunningSumArray();
        System.out.println(Arrays.toString(runningSumArray.runningSum(new int[]{1,2,3,4})));
        System.out.println(Arrays.toString(runningSumArray.runningSum(new int[]{1,1,1,1,1})));
        System.out.println(Arrays.toString(runningSumArray.runningSum(new int[]{3,1,2,10,1})));
    }

    public int[] runningSum(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            sum = nums[i] + nums[i + 1];
            nums[i + 1] = sum;
        }

        return nums;
    }
}

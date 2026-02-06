package leetcode.problems.arrays;

import java.util.Arrays;

public class TwoSumMediumDifficulty {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[] {2,7,11,15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[] {2,3,4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[] {-1,0}, -1)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        int sum = 0;

        while (start < end) {
            sum = numbers[start] + numbers[end];
            if (sum < target) {
                start++;
            } else if (sum > target){
                end--;
            } else {
                return new int[] {start + 1, end + 1};
            }
        }

        return new int[] {};
    }
}

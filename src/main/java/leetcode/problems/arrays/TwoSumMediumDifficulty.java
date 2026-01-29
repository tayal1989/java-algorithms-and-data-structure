package leetcode.problems.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumMediumDifficulty {

    public static void main(String[] args) {
        TwoSumMediumDifficulty tsmd = new TwoSumMediumDifficulty();
        System.out.println(Arrays.toString(tsmd.twoSum(new int[] {2,7,11,15}, 9)));
        System.out.println(Arrays.toString(tsmd.twoSum(new int[] {2,3,4}, 6)));
        System.out.println(Arrays.toString(tsmd.twoSum(new int[] {-1,0}, -1)));

        System.out.println(Arrays.toString(tsmd.twoSumOptimised(new int[] {2,7,11,15}, 9)));
        System.out.println(Arrays.toString(tsmd.twoSumOptimised(new int[] {2,3,4}, 6)));
        System.out.println(Arrays.toString(tsmd.twoSumOptimised(new int[] {-1,0}, -1)));
    }

    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int remainingNumber = target - numbers[i];

            if (map.containsKey(remainingNumber)) {
                return new int[] {map.get(remainingNumber) + 1, i + 1};
            }
            map.put(numbers[i], i);
        }

        return new int[] {};
    }

    public int[] twoSumOptimised(int[] numbers, int target) {
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

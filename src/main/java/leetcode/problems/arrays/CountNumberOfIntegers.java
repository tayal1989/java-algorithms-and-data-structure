package leetcode.problems.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountNumberOfIntegers {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 9};
        System.out.println(countFrequency(nums));
    }

    public static Map<Integer, Integer> countFrequency(int[] nums) {
        Map<Integer, Integer> resultMap = new HashMap<>();

        for (int num : nums) {
            resultMap.put(num, resultMap.getOrDefault(num, 0) + 1);
        }

        return resultMap;
    }
}

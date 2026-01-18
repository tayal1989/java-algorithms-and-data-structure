package leetcode.problems.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Problem: Two Sum (LeetCode - 1)
 *
 * Goal:
 * Given an array of integers and a target value, return the indices of the
 * two numbers such that they add up to the target.
 *
 * Constraints/Assumption:
 * - Exactly one solution exists (as per LeetCode statement)
 * - You may not use the same element twice
 *
 * Approach (Optimized using HashMap):
 * - Traverse the array once
 * - For each element nums[i], compute the complement:
 *      complement = target - nums[i]
 * - If the complement already exists in the map, we found the pair
 * - Otherwise, store the current element with its index in the map
 *
 * Why HashMap?
 * - Lookup (containsKey/get) is O(1) average
 *
 * Time Complexity: O(n)  -> one pass
 * Space Complexity: O(n) -> map stores elements in worst case
 */
public class TwoSumProblem {

    public static void main(String[] args) {

        // Creating object to test the method quickly using sample inputs
        TwoSumProblem tsp = new TwoSumProblem();

        // Test case 1: 2 + 7 = 9 => Expected indices: [0, 1]
        System.out.println(Arrays.toString(tsp.findTwoIndexElement(new int[]{2, 7, 11, 15}, 9)));

        // Test case 2: 2 + 4 = 6 => Expected indices: [1, 2]
        System.out.println(Arrays.toString(tsp.findTwoIndexElement(new int[]{3, 2, 4}, 6)));

        // Test case 3: 3 + 3 = 6 => Expected indices: [0, 1]
        System.out.println(Arrays.toString(tsp.findTwoIndexElement(new int[]{3, 3}, 6)));
    }

    /**
     * Finds the indices of two numbers in the array that add up to the target.
     *
     * @param nums   input array of integers
     * @param target sum we need to achieve using two elements
     * @return an array containing two indices, or empty array if no pair exists
     */
    public int[] findTwoIndexElement(int[] nums, int target) {

        /**
         * Map stores:
         * Key   -> number from the array
         * Value -> index of that number
         *
         * This helps us quickly check if the complement already exists.
         */
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate through array elements one by one
        for (int i = 0; i < nums.length; i++) {

            // Complement needed to achieve target with current number
            int remainingNumber = target - nums[i];

            /**
             * If complement already exists in map,
             * it means: complement + nums[i] == target
             * return indices immediately (early exit).
             */
            if (map.containsKey(remainingNumber)) {
                return new int[]{map.get(remainingNumber), i};
            }

            /**
             * Store current number and its index for future checks.
             * Important: We store after checking, to avoid using the same index twice.
             */
            map.put(nums[i], i);
        }

        /**
         * If no solution found, return empty array.
         * (LeetCode guarantees solution exists, but good practice for general coding.)
         */
        return new int[]{};
    }
}

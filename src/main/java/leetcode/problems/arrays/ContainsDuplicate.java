package leetcode.problems.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Problem: Contains Duplicate (LeetCode - 217)
 *
 * Goal:
 * Given an integer array, return true if any value appears at least twice
 * in the array, and return false if every element is distinct.
 *
 * Approach:
 * Use a HashSet to track numbers we have already seen.
 * - If a number is already present in the set, it means we found a duplicate -> return true
 * - Otherwise, add it to the set and continue scanning
 *
 * Time Complexity: O(n) -> single pass through the array
 * Space Complexity: O(n) -> in worst case, all elements are unique and stored in the set
 */
public class ContainsDuplicate {

    public static void main(String[] args) {

        // Creating an object of the class to test the method
        ContainsDuplicate cd = new ContainsDuplicate();

        // Test case 1: Contains duplicate '1' -> Expected output: true
        System.out.println(cd.containsDuplicate(new int[]{1, 2, 3, 1}));

        // Test case 2: No duplicates -> Expected output: false
        System.out.println(cd.containsDuplicate(new int[]{1, 2, 3, 4}));
    }

    /**
     * Checks if the given array contains any duplicate values.
     *
     * @param nums input integer array
     * @return true if any duplicate is found, otherwise false
     */
    public boolean containsDuplicate(int[] nums) {

        // HashSet is used because it provides O(1) average time complexity for add and contains operations
        Set<Integer> set = new HashSet<>();

        // Iterate through each element in the array
        for (int num : nums) {

            // If current number is already present in the set, it means it's a duplicate
            if (set.contains(num)) {
                return true;    // Early return to avoid unnecessary iterations
            }

            // Store the current number into the set for future duplicate checks
            set.add(num);
        }

        // If we reach here, no duplicates were found in the array
        return false;
    }
}

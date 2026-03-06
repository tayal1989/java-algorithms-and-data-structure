package leetcode.problems.arrays;

import java.util.*;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[] {100,4,200,1,3,2}));
        System.out.println(longestConsecutive(new int[] {0,3,7,2,5,8,4,6,0,1}));
        System.out.println(longestConsecutive(new int[] {1,0,1,2}));
        System.out.println(longestConsecutive(new int[] {1,2,6,7,8}));
        System.out.println(longestConsecutive(new int[] {4,0,-4,-2,2,5,2,0,-8,-8,-8,-8,-1,7,4,5,5,-4,6,6,-3}));

        System.out.println(longestConsecutiveUsingSet(new int[] {100,4,200,1,3,2}));
        System.out.println(longestConsecutiveUsingSet(new int[] {0,3,7,2,5,8,4,6,0,1}));
        System.out.println(longestConsecutiveUsingSet(new int[] {1,0,1,2}));
        System.out.println(longestConsecutiveUsingSet(new int[] {1,2,6,7,8}));
        System.out.println(longestConsecutiveUsingSet(new int[] {4,0,-4,-2,2,5,2,0,-8,-8,-8,-8,-1,7,4,5,5,-4,6,6,-3}));
    }

    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) { return 0; }
        if (nums.length == 1) { return 1; }

        int count = 1;
        int maxCount = 1;
        int loopCount = 0;
        int previous = 0;
        Arrays.sort(nums);

        for (int num : nums) {
            if (loopCount == 0) {
                previous = num;
                loopCount++;
            } else if (num == previous + 1) {
                count++;
                previous = num;
            } else if (num == previous) {
                previous = num;
            } else {
                count = 1;
                previous = num;
            }

            if (maxCount < count) {
                maxCount = count;
            }
        }

        return maxCount;
    }

    public static int longestConsecutiveUsingSet(int[] nums) {
        if (nums == null || nums.length == 0) { return 0; }
        if (nums.length == 1) { return 1; }

        int longestSequence = 0;
        Set<Integer> set = new HashSet<>();

        for (int j : nums) {
            set.add(j);
        }

        for (int num : set) {
            // Take the smallest number, if there is a smaller number in the set already present, then ignore
            if (! set.contains(num - 1)) {
                int currentNum = num;
                int currentCount = 1;
                while (set.contains(currentNum + 1)) {
                    currentCount++;
                    currentNum++;
                }

                if (longestSequence < currentCount) {
                    longestSequence = currentCount;
                }
            }
        }

        return longestSequence;
    }
}

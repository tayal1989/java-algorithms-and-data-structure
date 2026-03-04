package leetcode.problems.arrays;

public class MinSizeSubArraySum {

    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7, new int[] {2,3,1,2,4,3}));
        System.out.println(minSubArrayLen(4, new int[] {1,4,4}));
        System.out.println(minSubArrayLen(11, new int[] {1,1,1,1,1,1,1,1}));
        System.out.println(minSubArrayLen(213, new int[] {12,28,83,4,25,26,25,2,25,25,25,12}));
        System.out.println(minSubArrayLen(15, new int[] {5,1,3,5,10,7,4,9,2,8}));
        System.out.println(minSubArrayLen(15, new int[] {1,2,3,4,5}));
        System.out.println(minSubArrayLen(7, new int[] {1,1,1,1,7}));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int currentSum = 0;
        int minWindow = Integer.MAX_VALUE;

        // Taken two pointers
        int rightPointer = 0;
        int leftPointer = 0;

        while (rightPointer < nums.length) {
            currentSum = currentSum + nums[rightPointer];
            rightPointer++;

            while (currentSum >= target) {
                minWindow = Math.min(minWindow, rightPointer - leftPointer);
                currentSum = currentSum - nums[leftPointer];
                leftPointer++;
            }
        }

        return minWindow == Integer.MAX_VALUE ? 0 : minWindow;
    }
}

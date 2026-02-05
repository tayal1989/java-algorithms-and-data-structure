package leetcode.problems.arrays;

public class MaxSubArrayAvg {

    public static void main(String[] args) {
        MaxSubArrayAvg maxSubArrayAvg = new MaxSubArrayAvg();
        System.out.println(maxSubArrayAvg.findMaxAverage(new int[] {1,12,-5,-6,50,3}, 4));
        System.out.println(maxSubArrayAvg.findMaxAverage(new int[] {5}, 1));
    }

    public double findMaxAverage(int[] nums, int k) {
        if(nums.length == 0) { return 0; }
        if(nums.length == 1) { return nums[0]; }

        double currentSum = 0;

        for (int i = 0; i < k; i++) {
            currentSum = currentSum + nums[i];
        }

        double maxSum = currentSum;

        for (int i = k; i < nums.length; i++) {
            currentSum = currentSum + nums[i] - nums[i - k];    // Sliding window technique

            if(maxSum < currentSum) {
                maxSum = currentSum;
            }
        }

        return maxSum / k;
    }
}

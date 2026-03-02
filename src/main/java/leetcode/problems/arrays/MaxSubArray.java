package leetcode.problems.arrays;

public class MaxSubArray {

    public static void main(String[] args) {
        MaxSubArray maxSubArray = new MaxSubArray();
        System.out.println(maxSubArray.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(maxSubArray.maxSubArray(new int[] {1}));
        System.out.println(maxSubArray.maxSubArray(new int[] {5,4,-1,7,8}));
        System.out.println(maxSubArray.maxSubArray(new int[] {-1}));
        System.out.println(maxSubArray.maxSubArray(new int[] {-2,-1}));
        System.out.println(maxSubArray.maxSubArray(new int[] {-1,-2}));
    }

    public int maxSubArray(int[] nums) {
        if (nums.length == 0) { return 0; }
        if (nums.length == 1) { return nums[0]; }

        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++){
            if(currentSum < 0) {
                currentSum = nums[i];
            } else {
                currentSum = currentSum + nums[i];
            }

            if (maxSum < currentSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }
}

package leetcode.problems.arrays;

public class SubArraySumEqualsK {

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[] {1,2,3}, 3));
        System.out.println(subarraySum(new int[] {1,1,1}, 2));
        System.out.println(subarraySum(new int[] {1,2,1,2,1}, 3));
        System.out.println(subarraySum(new int[] {1,-1,0}, 0));
    }

    public static int subarraySum(int[] nums, int k) {
        if (nums.length == 0) { return 0; }
        if (nums.length == 1 && nums[0] == k) { return 1; }

        int count = 0;
        int rightPointer = 0;
        int sum = 0;
        int leftPointer = 0;

        while (rightPointer < nums.length) {
            sum = sum + nums[rightPointer];
            if (sum == k) {
                count++;
            }

            if (rightPointer == nums.length - 1) {
                sum = 0;
                leftPointer++;
                rightPointer = leftPointer;
                continue;
            }
            rightPointer++;
        }

        return count;
    }
}

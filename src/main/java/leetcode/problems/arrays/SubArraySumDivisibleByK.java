package leetcode.problems.arrays;

public class SubArraySumDivisibleByK {

    public static void main(String[] args) {
        System.out.println(subarraysDivByK(new int[] {4,5,0,-2,-3,1}, 5));
        System.out.println(subarraysDivByK(new int[] {5}, 9));
        System.out.println(subarraysDivByK(new int[] {-5}, 5));
        System.out.println(subarraysDivByK(new int[] {7,4,-10}, 5));
    }

    public static int subarraysDivByK(int[] nums, int k) {
        if (nums == null || nums.length == 0) { return 0; }
        if (nums.length == 1) {
            if (nums[0] % k == 0) {
                return 1;
            } else {
                return 0;
            }
        }

        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            int sum = nums[i];

            if (sum % k == 0) {
                count++;
            }

            for (int j = i + 1; j < nums.length; j++) {
                sum = sum + nums[j];
                if (sum % k == 0) {
                    count++;
                }
            }
        }

        if (nums[nums.length - 1] % k == 0) {
            count++;
        }

        return count;
    }
}

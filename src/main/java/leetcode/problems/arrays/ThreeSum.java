package leetcode.problems.arrays;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        System.out.println(threeSum(new int[] {-1,0,1,2,-1,-4}));
        System.out.println(threeSum(new int[] {0,1,1}));
        System.out.println(threeSum(new int[] {0,0,0}));
        System.out.println(threeSum(new int[] {0,0,0,0}));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);  //-4, -1, -1, 0, 1, 2

        int sum = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) { break; }

            int j = i + 1;
            int k = nums.length - 1;

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            while (j < k) {
                sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;
                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                }
            }
        }

        return list;
    }
}

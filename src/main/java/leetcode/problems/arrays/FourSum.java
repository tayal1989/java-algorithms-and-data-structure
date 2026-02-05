package leetcode.problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    public static void main(String[] args) {
        System.out.println(fourSum(new int[] {1,0,-1,0,-2,2}, 0));
        System.out.println(fourSum(new int[] {2,2,2,2,2}, 8));
        System.out.println(fourSum(new int[] {1000000000,1000000000,1000000000,1000000000}, -294967296));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> outputList = new ArrayList<>();
        Arrays.sort(nums);  //-2,-1,0,0,1,2

        for (int i = 0; i < nums.length -3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int k = j + 1;
                int l = nums.length - 1;
                while (k < l) {
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                    if (target == sum) {
                        outputList.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));

                        while (k < l && nums[k] == nums[k + 1]) {
                            k++;
                        }

                        while (k < l && nums[l] == nums[l - 1]) {
                            l--;
                        }

                        k++;
                    } else if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }

        return outputList;
    }
}

package leetcode.problems.arrays;

import java.util.*;

public class SingleNumber {

    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        System.out.println(singleNumber.singleNumber(new int[] {2,2,1}));
        System.out.println(singleNumber.singleNumber(new int[] {4,1,2,1,2}));
        System.out.println(singleNumber.singleNumber(new int[] {1}));

        System.out.println(singleNumber.singleNumberNew(new int[] {2,2,1}));
        System.out.println(singleNumber.singleNumberNew(new int[] {4,1,2,1,2}));
        System.out.println(singleNumber.singleNumberNew(new int[] {1}));
    }

    public int singleNumber(int[] nums) {
        if(nums.length == 0) { return 0; }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(map.get(nums[i]) != null) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(map.get(entry.getKey()) == 1) {
                return entry.getKey();
            }
        }

        return 0;
    }

    public int singleNumberNew(int[] nums) {
        if(nums.length == 0) { return 0; }

        int result = 0; // Start with 0 because a ^ 0 = a

        for (int num : nums) {
            result = result ^ num;  // XOR every number into the result
        }

        return result;
    }
}

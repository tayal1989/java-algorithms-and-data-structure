package leetcode.problems.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {

    public static void main(String[] args) {
        TwoSumProblem tsp = new TwoSumProblem();
        System.out.println(Arrays.toString(tsp.findTwoIndexElement(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(tsp.findTwoIndexElement(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(tsp.findTwoIndexElement(new int[]{3, 3}, 6)));
    }
    
    public int[] findTwoIndexElement(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
           int remainingNumber = target - nums[i];
           if(map.containsKey(remainingNumber)) {
               return new int[] {map.get(remainingNumber), i};
           }
           map.put(nums[i], i);
        }
        
        return new int[] {};
    }
}

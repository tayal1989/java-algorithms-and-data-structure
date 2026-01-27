package leetcode.problems.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ContainsDuplicateNearby {

    public static void main(String[] args) {
        ContainsDuplicateNearby cdn = new ContainsDuplicateNearby();
        System.out.println(cdn.containsNearbyDuplicate(new int[] {1,2,3,1}, 3));
        System.out.println(cdn.containsNearbyDuplicate(new int[] {1,0,1,1}, 1));
        System.out.println(cdn.containsNearbyDuplicate(new int[] {1,2,3,1,2,3}, 2));
        System.out.println(cdn.containsNearbyDuplicate(new int[] {1,2}, 2));

        System.out.println(cdn.containsNearbyDuplicateOptimise(new int[] {1,2,3,1}, 3));
        System.out.println(cdn.containsNearbyDuplicateOptimise(new int[] {1,0,1,1}, 1));
        System.out.println(cdn.containsNearbyDuplicateOptimise(new int[] {1,2,3,1,2,3}, 2));
        System.out.println(cdn.containsNearbyDuplicateOptimise(new int[] {1,2}, 2));
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length == 0) { return false; }
        if (k == 1 && nums.length <= 1) { return false; }

        int secondIndex = 0;
        int nearbyDistance = 0;
        boolean flag = false;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    if (secondIndex < j) {
                        secondIndex = j;
                        nearbyDistance = j - i;
                    }

                    if ((j - i) <= nearbyDistance) {
                        nearbyDistance = j - i;
                        flag = true;
                    }
                }
            }
        }

        if (flag && nearbyDistance <= k) {
            return true;
        }

        return false;
    }

    public boolean containsNearbyDuplicateOptimise(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }

            set.add(nums[i]);

            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }

        return false;
    }
}

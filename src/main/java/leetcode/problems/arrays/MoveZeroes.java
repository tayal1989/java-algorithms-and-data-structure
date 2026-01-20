package leetcode.problems.arrays;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        MoveZeroes moveZeroes = new MoveZeroes();

        moveZeroes.moveZeroes(new int[] {0,1,0,3,12});
        moveZeroes.moveZeroes(new int[] {0});
    }

    public void moveZeroes(int[] nums) {
        if(nums.length == 0) {
            return;
        }

        int j = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[j++] = num;
            }
        }

        while (j < nums.length) {
            nums[j++] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }
}

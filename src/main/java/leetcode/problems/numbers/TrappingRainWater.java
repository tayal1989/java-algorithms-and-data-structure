package leetcode.problems.numbers;

/**
 * https://www.youtube.com/watch?v=UZG3-vZlFM4
 */

public class TrappingRainWater {

    public static void main(String[] args) {
        System.out.println(trap(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
        System.out.println(trap(new int[] {4,2,0,3,2,5}));
        System.out.println(trap(new int[] {3,1,2,4,0,1,3,2}));
    }

    public static int trap(int[] height) {
        int totalTappedWater = 0;

        int[] leftArr = new int[height.length];
        int[] rightArr = new int[height.length];

        leftArr[0] = height[0];
        rightArr[height.length - 1] = height[height.length - 1];

        /*
        Take the max of current array element and the previous element
         */
        for (int i = 1; i < height.length; i++) {
            leftArr[i] = Math.max(height[i], leftArr[i - 1]);
        }

        for (int i = height.length - 2; i >= 0; i--) {
            rightArr[i] = Math.max(height[i], rightArr[i + 1]);
        }

//        System.out.println(Arrays.toString(leftArr));
//        System.out.println(Arrays.toString(rightArr));

        for (int i = 0; i < height.length; i++) {
            int minElement = Math.min(leftArr[i], rightArr[i]);
            totalTappedWater = totalTappedWater + minElement - height[i];
        }

        return totalTappedWater;
    }
}

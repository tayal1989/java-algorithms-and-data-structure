package leetcode.problems.numbers;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        ContainerWithMostWater cm = new ContainerWithMostWater();
        System.out.println(cm.maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
        System.out.println(cm.maxArea(new int[] {1,1}));
    }

    public int maxArea(int[] height) {
        int currentHeight;
        int maxHeight = 0;
        int start = 0;
        int end = height.length - 1;

        while (start < end) {
            /*
            Logic here is we move the shorter height pointer between left and right because there is a
            possibility that we will get max area with the taller height.
             */

            if (height[start] <= height[end]) {
                currentHeight = height[start] * (end - start);
                start++;
            } else {
                currentHeight = height[end] * (end - start);
                end--;
            }

            if (currentHeight > maxHeight) {
                maxHeight = currentHeight;
            }
        }

        return maxHeight;
    }
}

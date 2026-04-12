package leetcode.problems.strings;

public class ReverseStringWithoutLoop {

    public static void main(String[] args) {
        System.out.println(reverseString("Vishal"));
        System.out.println(revString("Vishal"));
        System.out.println(revString("Myra"));
    }

    public static String reverseString(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static String revString(String str) {
        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        return new String(arr);
    }
}

package leetcode.problems.strings;

public class ReverseStringWithoutLoop {

    public static void main(String[] args) {
        System.out.println(reverseString("Vishal"));
    }

    public static String reverseString(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}

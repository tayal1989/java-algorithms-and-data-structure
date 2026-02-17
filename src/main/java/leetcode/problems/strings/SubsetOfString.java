package leetcode.problems.strings;

public class SubsetOfString {

    public static void main(String[] args) {
        subsetString("ABC", "");
    }

    public static void subsetString(String remaining, String current) {
        if (remaining.isEmpty()) {
            System.out.println(current);
            return;
        }

        subsetString(remaining.substring(1), current + remaining.charAt(0));
        subsetString(remaining.substring(1), current);
    }
}

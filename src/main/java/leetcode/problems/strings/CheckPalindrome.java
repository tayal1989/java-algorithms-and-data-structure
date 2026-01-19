package leetcode.problems.strings;

public class CheckPalindrome {
    public static void main(String[] args) {
        CheckPalindrome checkPalindrome = new CheckPalindrome();

        System.out.println(checkPalindrome.checkPalindrome("Nitin"));
        System.out.println(checkPalindrome.checkPalindrome("Malyalam"));
        System.out.println(checkPalindrome.checkPalindrome("Vishal"));
        System.out.println(checkPalindrome.checkPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(checkPalindrome.checkPalindrome("race a car"));
    }

    public boolean checkPalindrome(String s) {
        String newString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start = 0;
        int end = newString.length() - 1;

        while (start < end) {
            if(newString.charAt(start) != newString.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

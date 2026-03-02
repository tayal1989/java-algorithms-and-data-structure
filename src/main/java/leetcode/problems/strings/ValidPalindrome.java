package leetcode.problems.strings;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("Nitin"));
        System.out.println(checkPalindrome("Malyalam"));
        System.out.println(checkPalindrome("Vishal"));
        System.out.println(checkPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(checkPalindrome("race a car"));

        System.out.println();

        System.out.println(checkPalindromeFastSolution("Nitin"));
        System.out.println(checkPalindromeFastSolution("Malyalam"));
        System.out.println(checkPalindromeFastSolution("Vishal"));
        System.out.println(checkPalindromeFastSolution("A man, a plan, a canal: Panama"));
        System.out.println(checkPalindromeFastSolution("race a car"));
    }

    public static boolean checkPalindrome(String s) {
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

    public static boolean checkPalindromeFastSolution(String s) {
        if(s.isEmpty()) {
            return true;
        }

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            char firstChar = s.charAt(start);
            char lastChar = s.charAt(end);

            if(!Character.isLetterOrDigit(firstChar)) {
                start++;
            } else if(!Character.isLetterOrDigit(lastChar)) {
                end--;
            } else {
                if (Character.toLowerCase(firstChar) != Character.toLowerCase(lastChar)) {
                    return false;
                }

                start++;
                end--;
            }
        }
        return true;
    }
}

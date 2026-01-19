package leetcode.problems.strings;

public class CheckPalindrome {
    public static void main(String[] args) {
        CheckPalindrome checkPalindrome = new CheckPalindrome();

        System.out.println(checkPalindrome.checkPalindrome("Nitin"));
        System.out.println(checkPalindrome.checkPalindrome("Malyalam"));
        System.out.println(checkPalindrome.checkPalindrome("Vishal"));
        System.out.println(checkPalindrome.checkPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(checkPalindrome.checkPalindrome("race a car"));

        System.out.println();

        System.out.println(checkPalindrome.checkPalindromeFastSolution("Nitin"));
        System.out.println(checkPalindrome.checkPalindromeFastSolution("Malyalam"));
        System.out.println(checkPalindrome.checkPalindromeFastSolution("Vishal"));
        System.out.println(checkPalindrome.checkPalindromeFastSolution("A man, a plan, a canal: Panama"));
        System.out.println(checkPalindrome.checkPalindromeFastSolution("race a car"));
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

    public boolean checkPalindromeFastSolution(String s) {
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

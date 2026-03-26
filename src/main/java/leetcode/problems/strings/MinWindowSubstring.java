package leetcode.problems.strings;

public class MinWindowSubstring {

    public static void main(String[] args) {
        System.out.println(findMinWindowSubstring("ADOBECODEBANC", "ABC")); // BANC
        System.out.println(findMinWindowSubstring("AAABBC", "AABBC")); // AABBC
        System.out.println(findMinWindowSubstring("ABC", "XYZ")); // ""
        System.out.println(findMinWindowSubstring("a", "a")); // a
        System.out.println(findMinWindowSubstring("aabdec", "abc")); // abdec
        System.out.println(findMinWindowSubstring("ab", "abc")); // ""
        System.out.println(findMinWindowSubstring("aaabdabcefaecbef", "abc")); // abc
    }

    public static String findMinWindowSubstring(String firstStr, String secondStr) {
        if (firstStr == null || secondStr == null || firstStr.isEmpty() || secondStr.isEmpty() ||
        firstStr.length() < secondStr.length()) {
            return "";
        }

        int startIndex = 0;
        int[] secondFreq = new int[256];
        int[] firstFreq = new int[256];
        int left = 0;
        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i < secondStr.length(); i++) {
            secondFreq[secondStr.charAt(i)]++;
        }

        for (int right = 0; right < firstStr.length(); right++) {
            firstFreq[firstStr.charAt(right)]++;
            while (containsMap(firstFreq, secondFreq)) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    startIndex = left;
                }
                firstFreq[firstStr.charAt(left)]--;
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? "" : firstStr.substring(startIndex, startIndex + minLength);
    }

    private static boolean containsMap(int[] firstFreq, int[] secondFreq) {
        for (int i = 0; i < 256; i++) {
            if (firstFreq[i] < secondFreq[i]) {
                return false;
            }
        }
        return true;
    }
}

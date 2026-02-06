package leetcode.problems.strings;

import java.util.Arrays;

/**
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed
 * by using the letters from magazine and false otherwise.
 * Each letter in magazine can only be used once in ransomNote.
 *
 * Example 1:
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 *
 * Example 2:
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 *
 * Example 3:
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 */
public class RansomNote {

    public static void main(String[] args) {
        RansomNote sc = new RansomNote();
        System.out.println(sc.canConstruct("a", "b"));
        System.out.println(sc.canConstruct("aa", "ab"));
        System.out.println(sc.canConstruct("aa", "aab"));
        System.out.println(sc.canConstruct("aab", "baa"));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        int[] arr = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            arr[ch - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            arr[ch - 'a']--;
            if(arr[ch - 'a'] < 0) {
                System.out.println(Arrays.toString(arr));
                return false;
            }
        }

        System.out.println(Arrays.toString(arr));

        return true;
    }
}

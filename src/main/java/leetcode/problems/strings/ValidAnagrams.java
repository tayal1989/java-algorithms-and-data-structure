package leetcode.problems.strings;

import java.util.Arrays;

public class ValidAnagrams {

    public static void main(String[] args) {
        System.out.println(isValidAnagram("anagram", "nagaram"));
        System.out.println(isValidAnagram("rat", "car"));
        System.out.println(isValidAnagram("ab", "a"));
        System.out.println(isValidAnagram("aa", "a"));
    }

    public static boolean isValidAnagram(String firstStr, String secondStr) {
        if (firstStr.length() != secondStr.length()) return false;

        int[] arr1 = new int[26];

        for (int i = 0; i < firstStr.length(); i++) {
            arr1[firstStr.charAt(i) - 'a']++;
        }

        for (int i = 0; i < secondStr.length(); i++) {
            int freqArr = arr1[secondStr.charAt(i) - 'a'];
            freqArr--;
            if (freqArr < 0) {
                return false;
            }
        }

        return true;
    }
}

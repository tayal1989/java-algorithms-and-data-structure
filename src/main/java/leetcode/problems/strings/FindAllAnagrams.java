package leetcode.problems.strings;

import java.util.*;

/**
 * Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.
 *
 * Example 1:
 * Input: s = "cbaebabacd", p = "abc"
 * Output: [0,6]
 * Explanation:
 * The substring with start index = 0 is "cba", which is an anagram of "abc".
 * The substring with start index = 6 is "bac", which is an anagram of "abc".
 *
 * Example 2:
 * Input: s = "abab", p = "ab"
 * Output: [0,1,2]
 * Explanation:
 * The substring with start index = 0 is "ab", which is an anagram of "ab".
 * The substring with start index = 1 is "ba", which is an anagram of "ab".
 * The substring with start index = 2 is "ab", which is an anagram of "ab".
 */
public class FindAllAnagrams {

    public static void main(String[] args) {
        FindAllAnagrams findAllAnagrams = new FindAllAnagrams();

        System.out.println(findAllAnagrams.findAnagrams("cbaebabacd", "abc"));
        System.out.println(findAllAnagrams.findAnagrams("abab", "ab"));
    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();

        if (s.length() < p.length()) {
            return list;
        }

        int[] sArr = new int[26];
        int[] pArr = new int[26];

        for (int i = 0; i < p.length(); i++) {
            sArr[s.charAt(i) - 'a']++;
            pArr[p.charAt(i) - 'a']++;
        }

        if (Arrays.equals(sArr, pArr)) {
            list.add(0);
        }

        for (int i = p.length(); i < s.length(); i++) {
            sArr[s.charAt(i) - 'a']++;
            sArr[s.charAt(i - p.length()) - 'a']--;

            if (Arrays.equals(sArr, pArr)) {
                list.add(i - p.length() + 1);
            }
        }

        return list;
    }
}

package leetcode.problems.strings;

import java.util.*;

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

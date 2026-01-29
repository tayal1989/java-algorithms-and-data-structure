package leetcode.problems.strings;

import java.util.*;

public class LongestSubstring {

    public static void main(String[] args) {
        LongestSubstring ls = new LongestSubstring();
        System.out.println(ls.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(ls.lengthOfLongestSubstring("bbbbb"));
        System.out.println(ls.lengthOfLongestSubstring("pwwkew"));
        System.out.println(ls.lengthOfLongestSubstring("aab"));
        System.out.println(ls.lengthOfLongestSubstring(""));
        System.out.println(ls.lengthOfLongestSubstring("p"));
        System.out.println(ls.lengthOfLongestSubstring("au"));
        System.out.println(ls.lengthOfLongestSubstring("dvdf"));
    }

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int longestLen = Integer.MIN_VALUE;

        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            longestLen = Math.max(longestLen, right - left + 1);
        }

        return longestLen == Integer.MIN_VALUE ? 0 : longestLen;
    }
}

package leetcode.problems.strings;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagrams {

    public static void main(String[] args) {
        ValidAnagrams validAnagrams = new ValidAnagrams();
        System.out.println(validAnagrams.isAnagram("anagram", "nagaram"));
        System.out.println(validAnagrams.isAnagram("rat", "car"));
        System.out.println(validAnagrams.isAnagram("ab", "a"));
        System.out.println(validAnagrams.isAnagram("aa", "a"));
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(map1.get(ch) != null) {
                map1.put(ch, map1.get(ch) + 1);
            } else {
                map1.put(ch, 1);
            }
        }

        for(int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if(map2.get(ch) != null) {
                map2.put(ch, map2.get(ch) + 1);
            } else {
                map2.put(ch, 1);
            }
        }

        return map1.equals(map2);
    }
}

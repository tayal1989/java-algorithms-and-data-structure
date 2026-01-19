package leetcode.problems.strings;

import java.util.Map;
import java.util.TreeMap;

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

        Map<Character, Integer> map1 = new TreeMap<>();
        Map<Character, Integer> map2 = new TreeMap<>();

        for(int i = 0; i < s.length(); i++) {
            if(map1.get(s.charAt(i)) != null) {
                map1.put(s.charAt(i), map1.get(s.charAt(i)) + 1);
            } else {
                map1.put(s.charAt(i), 1);
            }
        }

        for(int i = 0; i < t.length(); i++) {
            if(map2.get(t.charAt(i)) != null) {
                map2.put(t.charAt(i), map2.get(t.charAt(i)) + 1);
            } else {
                map2.put(t.charAt(i), 1);
            }
        }

        return map1.equals(map2);
    }
}

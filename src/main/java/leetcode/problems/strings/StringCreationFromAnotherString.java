package leetcode.problems.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringCreationFromAnotherString {

    public static void main(String[] args) {
        StringCreationFromAnotherString sc = new StringCreationFromAnotherString();
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
                return false;
            }
        }

        return true;
    }
}

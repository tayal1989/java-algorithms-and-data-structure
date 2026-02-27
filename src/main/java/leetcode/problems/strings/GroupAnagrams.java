package leetcode.problems.strings;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"}));
//        System.out.println(groupAnagrams(new String[] {""}));
//        System.out.println(groupAnagrams(new String[] {"a"}));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) { return new ArrayList<>(); }

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            String word = getFrequencyString(str);

            if (map.containsKey(word)) {
                map.get(word).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(word, list);
            }
        }

        return new ArrayList<>(map.values());
    }

    public static String getFrequencyString(String str) {
        int[] frequencyArray = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequencyArray[ch - 'a']++;
        }

        char ch = 'a';
        StringBuilder sb = new StringBuilder();

        for (int j : frequencyArray) {
            if (j != 0) {
                sb.append(ch);
                sb.append(j);
            }
            ch++;
        }

        System.out.println(sb);

        return sb.toString();
    }
}

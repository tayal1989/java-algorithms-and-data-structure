package leetcode.problems.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqCharInString {

    public static void main(String[] args) {
        FirstUniqCharInString firstUniqCharInString = new FirstUniqCharInString();
        System.out.println(firstUniqCharInString.firstUniqChar("leetcode"));
        System.out.println(firstUniqCharInString.firstUniqChar("loveleetcode"));
        System.out.println(firstUniqCharInString.firstUniqChar("aabb"));

        System.out.println(firstUniqCharInString.firstUniqCharOptimised("leetcode"));
        System.out.println(firstUniqCharInString.firstUniqCharOptimised("loveleetcode"));
        System.out.println(firstUniqCharInString.firstUniqCharOptimised("aabb"));
    }

    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(map.get(ch) != null) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(map.get(entry.getKey()) == 1) {
                return s.indexOf(entry.getKey());
            }
        }

        return -1;
    }

    public int firstUniqCharOptimised(String s) {
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if(arr[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}

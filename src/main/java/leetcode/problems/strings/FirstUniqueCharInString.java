package leetcode.problems.strings;

public class FirstUniqueCharInString {

    public static void main(String[] args) {
        System.out.println(firstUniqueChar("leetcode"));
        System.out.println(firstUniqueChar("loveleetcode"));
        System.out.println(firstUniqueChar("aabb"));
    }

    public static int firstUniqueChar(String s) {
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

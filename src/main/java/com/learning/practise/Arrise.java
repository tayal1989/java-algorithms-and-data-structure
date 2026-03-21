package com.learning.practise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Arrise {

    public static void main(String[] args) {
        reverseString("Vishal");
        findDuplicate(new int[] {1,2,3,1});
        findDuplicate(new int[] {1,2,3});
        pallidromeCheck("Nitin");
        pallidromeCheck("Vishal");
        countCharacterFrequency("aabbccc");
    }

    public static void reverseString(String str) {
        String outputStr = "";

        for (int i = 0; i < str.length(); i++) {
            outputStr = str.charAt(i) + outputStr;
        }

        System.out.println("Reverse of the string is : " + outputStr);
    }

    public static void findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        boolean flag = true;

        for (int num : nums) {
            if (set.contains(num)) {
                flag = false;
                System.out.println("Duplicate number : " + num);
            }
            set.add(num);
        }

        if (flag) {
            System.out.println("No duplicate numbers");
        }
    }

    public static void pallidromeCheck(String str) {
        int start = 0;
        int end = str.length() - 1;
        boolean flag = true;
        str = str.toLowerCase();

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                flag = false;
                break;
            }
            start++;
            end--;
        }

        if (flag) {
            System.out.println(str + " is pallindrome");
        } else {
            System.out.println(str + " is not pallindrome");
        }
    }

    public static void countCharacterFrequency(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

package com.learning.practise;

public class CommonCharacterInThreeStrings {

    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "adefg";
        String str3 = "dxaeh";

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        int[] arr3 = new int[26];

        String out = "";

        for (int i = 0; i < str1.length(); i++) {
            arr1[str1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < str2.length(); i++) {
            arr2[str2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < str3.length(); i++) {
            arr3[str3.charAt(i) - 'a']++;
        }

        char ch = 'a';

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > 0 && arr2[i] > 0 && arr3[i] > 0) {
                if (arr1[i] == arr2[i] && arr2[i] == arr3[i]) {
                    out = out + ch;
                }
            }
            ch++;
        }

        System.out.println(out);
    }
}

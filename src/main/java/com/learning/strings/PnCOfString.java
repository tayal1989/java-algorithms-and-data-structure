package com.learning.strings;

public class PnCOfString {

    public static void permutationOfString(String str, String prefix) {
        if(str.isEmpty()) {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            permutationOfString(remaining, prefix + ch);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";

        System.out.println("Permutations : ");
        permutationOfString(str, "");
    }
}

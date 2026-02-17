package leetcode.problems.strings;

import java.util.HashMap;
import java.util.Map;

public class CountCharactersWithReverseString {

    public static void main(String[] args) {
        System.out.println(countCharacters("abc dbc"));
        System.out.println(countCharacters("Vishal Agarwal"));

        System.out.println(reverseEachWordInString("blue is sky"));
        System.out.println(reverseEachWordInString("Vishal Agarwal"));

        System.out.println(reverseEachWord("blue is sky"));
        System.out.println(reverseEachWord("Vishal Agarwal"));
    }

    public static String reverseString(String str) {
        StringBuilder output = new StringBuilder();
        String[] outputArr = str.trim().split("\\s+");

        for (int i = outputArr.length - 1; i >= 0; i--) {
            output.append(outputArr[i]);
            if (i > 0) {
                output.append(" ");
            }
        }

        return output.toString();
    }

    public static String countCharacters(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        String inputStr = reverseString(str).toLowerCase();
        StringBuilder outputStr = new StringBuilder();

        for (int i = 0; i < inputStr.length(); i++) {
            char ch = inputStr.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                map.merge(ch, 1, Integer::sum);
            }
        }

        for (Map.Entry<Character, Integer> entry:map.entrySet()) {
            outputStr.append(entry.getKey()).append(entry.getValue());
        }

        return outputStr.toString();
    }

    public static String reverseEachWordInString(String str) {
        StringBuilder reverseOutput = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reverseOutput.append(str.charAt(i));
        }

        return reverseOutput.toString();
    }

    public static String reverseEachWord(String str) {
        StringBuilder reverseOutput = new StringBuilder();
        String[] outputArr = str.trim().split("\\s+");

        for (int i = 0; i < outputArr.length; i++) {
            for (int j = outputArr[i].length() - 1; j >=0; j--) {
                reverseOutput.append(outputArr[i].charAt(j));
            }

            if (i != outputArr.length - 1) {
                reverseOutput.append(" ");
            }
        }

        return reverseOutput.toString();
    }
}

package com.learning.strings;

import java.util.HashMap;

public class CountCharacters {
	public static void main(String[] args) {
		String str = "abcabc";

		HashMap<Character, Integer> hmp = new HashMap<Character, Integer>();
		// HashMap<Integer,Integer> hmp = new HashMap<Integer,Integer>();

		for (int i = 0; i < str.length(); i++) {
			if (hmp.get(str.charAt(i)) != null) {
				hmp.put(str.charAt(i), hmp.get(str.charAt(i)) + 1);
			} else {
				hmp.put(str.charAt(i), 1);
			}
		}

		for (Character key : hmp.keySet()) {
			System.out.println("key: " + key + " & Value : " + hmp.get(key));
		}
	}
}
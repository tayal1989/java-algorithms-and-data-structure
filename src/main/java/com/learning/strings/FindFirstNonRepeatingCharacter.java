package com.learning.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FindFirstNonRepeatingCharacter {

	public static void main(String[] args) {
		boolean flag = false ;
		
		String inputStr = "aabcdb"; // # c
		inputStr = "abcddc"; //# a
		inputStr = "aabbcc"; //# _
		inputStr = "abbcda"; //# c
		
		HashMap<Character, Integer> hmap = new LinkedHashMap<Character, Integer>();
		
		for(int i = 0; i < inputStr.length() ; i++) {
			if(hmap.get(inputStr.charAt(i)) != null) {
				hmap.put(inputStr.charAt(i), hmap.get(inputStr.charAt(i)) + 1);
			} else {
				hmap.put(inputStr.charAt(i), 1);
			}
		}
		
		for(Character key: hmap.keySet()) {
			System.out.println("key: " + key + " & Value : " + hmap.get(key));
			if(hmap.get(key) == 1) {
				System.out.println("First Non Repeating Char -> " + key);
				flag = false ;
				break;
			} else {
				flag = true ;
			}
		}
		
		if(flag) {
			System.out.println("No Repeating Char");
		}
	}

}

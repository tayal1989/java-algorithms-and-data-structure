package com.learning.strings;

import java.util.HashMap;

public class AnagramStrings {
	
	public static HashMap<Character, Integer> prepareHashMap(String str) {
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		
		for(int i = 0 ; i < str.length() ; i++) {
			if(hmap.get(str.charAt(i)) != null) {
				hmap.put(str.charAt(i), hmap.get(str.charAt(i)) + 1) ;
			} else {
				hmap.put(str.charAt(i), 1) ;
			}
		}
		
		return hmap ;
	}

	public static void main(String[] args) {
		String str1 = "integral" ;
		String str2 = "triangle" ;
		boolean flag = false ;
		
		HashMap<Character, Integer> hmap1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> hmap2 = new HashMap<Character, Integer>();
		
		hmap1 = prepareHashMap(str1) ;
		hmap2 = prepareHashMap(str2) ;
		
		if(hmap1.size() != hmap2.size()) {
			flag = false ;
		} else {
			for(Character key : hmap1.keySet()) {
				System.out.println(key + " --> " + hmap1.get(key));
				if(hmap2.containsKey(key)) {
					System.out.println(key + " --> " + hmap2.get(key));
					if(hmap1.get(key) == hmap2.get(key)) {
						flag = true ;
					} else {
						flag = false ;
						break ;
					}
				} else {
					flag = false ;
					break ;
				}
			}
		}
		
		if(flag) {
			System.out.println("Strings are anagram");
		} else {
			System.out.println("Strings are not anagram");
		}
	}

}

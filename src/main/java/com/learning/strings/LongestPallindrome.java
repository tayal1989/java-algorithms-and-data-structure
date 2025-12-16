package com.learning.strings;

public class LongestPallindrome {
	
	public static void main(String[] args) {
		String str = "racecar" ;
		String max = "" ;
		
		for(int i = 0 ; i < str.length() ; i++) {
			String s1 = expandString(str, i, i);
			String s2 = expandString(str, i, i + 1);
			System.out.println(s1);
			System.out.println(s2);
			String maxOfTwo = s1.length() > s2.length() ? s1 : s2 ;
			System.out.println("Value --> " + maxOfTwo);
			
			if(max.length() < maxOfTwo.length()) {
				max = maxOfTwo ;
			}
		}
		
		System.out.println(max);
	}
	
	public static String expandString(String str, int left, int right) {
		String pallindrome = "" ;
		while(left >= 0 && right <= str.length() - 1 && str.charAt(left) == str.charAt(right)) {
			pallindrome = str.substring(left, right + 1);
			left-- ;
			right++ ;
		}
		
		return pallindrome;
	}

}

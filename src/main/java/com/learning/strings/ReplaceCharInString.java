package com.learning.strings;

public class ReplaceCharInString {

	public static boolean containsChar(String word, char letter) {
		for(char ch : word.toCharArray()) {
			if(ch == letter) {
				return true ;
			}
		}
		return false ;
	}
	
	public static String replace(String word, char oldLetter, char newLetter) {
		String output = "" ;
		for(int i = 0 ; i < word.length() ; i++) {
			if(word.charAt(i) == oldLetter) {
				output = output + newLetter ;
			} else {
				output = output + word.charAt(i) ;
			}
		}
		return output ;
	}
	
	public static void main(String[] args) {
		System.out.println(containsChar("Vishal", 'i'));
		System.out.println(containsChar("Vishal", 'n'));
		System.out.println(replace("Modi", 'M', 'L'));
	}

}

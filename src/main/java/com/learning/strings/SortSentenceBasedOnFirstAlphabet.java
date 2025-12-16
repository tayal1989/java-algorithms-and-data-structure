package com.learning.strings;

public class SortSentenceBasedOnFirstAlphabet {

	public static void main(String[] args) {
		String str = "AaBb" ;
//		String str = "dcba" ;
//		String str = "geeksforgeeks" ;
		String output = sortString(str);
		System.out.println("Sorted String : " + output);
		
		String sentence = "My Name Is Vishal Agarwal" ;
		String out = sortStringBasedOnFirstChar(sentence) ;
		System.out.println("Sorted Sentence Based On First Char : " + out);
	}
	
	public static String sortString(String str) {
		char[] charArr = str.toCharArray();
		int temp = 0 ;
		String output = "" ;
		
		for(int i = 0 ; i < charArr.length ; i++) {
			for(int j = i + 1 ; j < charArr.length ; j++) {
				if(charArr[i] > charArr[j]) {
					temp = charArr[i] ;
					charArr[i] = charArr[j] ;
					charArr[j] = (char) temp ;
				}
			}
		}
		
		for(int i = 0 ; i < charArr.length ; i++) {
			output = output + charArr[i] ;
		}
		
		return output ;
	}
	
	public static String sortStringBasedOnFirstChar(String str) {
		String output = "" ;
		String[] strArr = str.split(" ");
		String temp = "" ;
		
		for(int i = 0 ; i < strArr.length ; i++) {
			for(int j = i + 1 ; j < strArr.length ; j++) {
				if(strArr[i].charAt(0) > strArr[j].charAt(0)) {
					temp = strArr[i] ;
					strArr[i] = strArr[j] ;
					strArr[j] = temp ;
				}
			}
		}
		
		for(int i = 0 ; i < strArr.length ; i++) {
			if(i != strArr.length - 1) {
				output = output + strArr[i] + " " ;
			} else {
				output = output + strArr[i] ;
			}
		}
		
		return output ;
	}

}

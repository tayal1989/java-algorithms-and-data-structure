package com.learning.strings;

public class FindIndexOfWord {

	public static void main(String[] args) {
		String inputString = "My name is Vishal Agarwal" ;
		String inputToFind = "name" ;
//		String inputToFind = "Shashank" ;
//		String inputToFind = "Vishal" ;
		String tempOutput = "" ;
		int count = 0 ;
		boolean flag = false ;
		
		for(int i = 0 ; i < inputString.length() ; i++) {
			if(inputToFind.charAt(count) == inputString.charAt(i)) {
				tempOutput = tempOutput + inputString.charAt(i) ;
				count++ ;
				
				if(tempOutput.equalsIgnoreCase(inputToFind)) {
					flag = true ;
					System.out.println("Found input string : " + inputToFind);
					System.out.println("Index Position : " + (i - inputToFind.length() + 1));
					break ;
				}
			} else {
				count = 0 ;
			}
		}
		
		if(!flag) {
			System.out.println("Input String not found");
		}

	}

}

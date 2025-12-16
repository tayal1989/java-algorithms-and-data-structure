package com.learning.strings;

public class ReverseEveryWordInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "My name is Vishal" ;
		
		String[] secondStr = str.split(" ") ;

		String revStr = "" ;
		String revStr1 = "" ;
		
		System.out.println("Reverse string : \n");
		
		//Problem Solved
		//Complexity : n square
		
		for(int i = 0 ; i < secondStr.length ; i++){
			revStr = secondStr[i] ;
			for(int j = 0 ; j < revStr.length() ; j++){
				revStr1 = revStr.charAt(j) + revStr1 ;
			}
			revStr = "" ;
			System.out.print(revStr1 + " ");
			revStr1 = "" ;			
		}
		
	}

}

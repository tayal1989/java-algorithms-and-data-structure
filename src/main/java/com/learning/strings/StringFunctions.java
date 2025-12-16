package com.learning.strings;

import java.util.Scanner;

public class StringFunctions {
	
	public static void reverseString(String inputString){
		String revString = "";
		
		for(int i = 0; i < inputString.length(); i++){
			revString = inputString.charAt(i) + revString ;
		}
		
		System.out.println("Reverse of input string is : " + revString);
	}
	
	public static void reverseStringUsingSwapping(String inputString){
		char[] input = inputString.toCharArray();
		int start = 0, end = inputString.length() -1 ;
		
		while(start <= end ){
			char temp = input[start] ;
			input[start] = input[end] ;
			input[end] = temp ;
			start++ ;
			end-- ;
		}
		
		System.out.print("Reverse of input string is : ");
		
		for(int i = 0; i < input.length ; i++){
			System.out.print(input[i]);
		}
		
	}
	
	public static void reverseWordInSentence(String inputString){
		String[] input = inputString.split(" ");

		String result = "" ;
		
		for(int i =input.length - 1 ; i >= 0 ; i--){
			result += (input[i] + " ");
		}
		
		System.out.println("\nReverse of input string is : " + result.trim());
	}
	
	public static void countLengthOfString(String inputString){
		int count = 0 ;
		for(char c : inputString.toCharArray()){
			count++ ;
		}
		
		System.out.println("\nLength of input string is : " + count);
		
		count = 0 ;
		
		char[] ch = inputString.toCharArray();
		
		try{
			for(int i = 0; ch[i] != '\0'; i++){
				count++;
			}
		}catch(Exception e){
			
		}
		
		
		System.out.println("\nLength of input string is : " + count);
	}
	
	public static void isPallindrome(String inputString){
		int start = 0, end = inputString.length() - 1;
		boolean flag = false ;
		
		while(start < end){
			if(inputString.charAt(start) == inputString.charAt(end)){
				flag = true ;
			}
			start++ ;
			end-- ;
		}
		
		if(flag == true){
			System.out.println("String is pallindrome");
		}else{
			System.out.println("String is not pallindrome");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String inputString = sc.nextLine();
		
		StringFunctions.reverseString(inputString);
		StringFunctions.reverseStringUsingSwapping(inputString);
		StringFunctions.reverseWordInSentence(inputString);
		StringFunctions.countLengthOfString(inputString);
		StringFunctions.isPallindrome(inputString);
		
		sc.close();
	}

}
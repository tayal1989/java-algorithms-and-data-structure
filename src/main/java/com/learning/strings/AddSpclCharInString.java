package com.learning.strings;

public class AddSpclCharInString {

	public static void main(String[] args) {
		char[] str = "I am a good boy".toCharArray() ;
		String outStr = "" ;
		
		for(int i = 0 ; i < str.length ; i++){
			if(str[i] == ' '){
				outStr = outStr + "%20" ;
			} else {
				outStr = outStr + str[i] ;
			}
		}
		
		System.out.println("Output string is : " + outStr);
		
		String anotherStr = "I am a good boy" ;
		String[] splitArr = anotherStr.split(" ") ;
		String outputString = "" ;
		
		for(int i = 0 ; i < splitArr.length ; i++){
			if(i == splitArr.length - 1){
				outputString = outputString + splitArr[i] ;
			} else {
				outputString = outputString + splitArr[i] + "%20";
			}
		}
		
		System.out.println("Another way of solving the problem, output : " + outputString);
	}

}

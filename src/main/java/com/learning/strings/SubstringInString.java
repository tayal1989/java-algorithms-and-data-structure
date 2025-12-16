package com.learning.strings;

public class SubstringInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Abcdesf" ;
		String subStr = "abcdx" ;
		
		str = str.toLowerCase() ;
		subStr = subStr.toLowerCase() ;
		
		int count = 0 ;
		
		int[] strArr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0} ;
		
		for(int ind = 0 ; ind <= str.length() - 1 ; ind++){
			int value = str.charAt(ind) - 97 ;
			if((value >= 0) && (value <= 25)){
				strArr[value]++;
			}
		}
		
		for(int i = 0 ; i < strArr.length ; i++){
			System.out.print(strArr[i] + " ");
		}
		
		System.out.println();
		
		for(int ind = 0 ; ind < subStr.length() ; ind++){
			int value = subStr.charAt(ind) - 97 ;
			if((value >= 0) && (value <= 25)){
				if(strArr[value] >= 1){
					count++ ;
				}
			}
		}
		
		System.out.println("Count : " + count);
		
		if(count >= subStr.length()){
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}

}

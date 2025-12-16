package com.learning.numbers;

import java.util.Scanner;

public class CountOccurrenceOfNumberAndString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter a number : ");
		int number = sc.nextInt() ;
		
		int rem = 0 ;
		int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0} ;
		
		while(number >= 9){
			rem = number % 10 ;
			number = number / 10 ;
			arr[rem]++ ;
		}
		
		if(number != 0){
			arr[number]++ ;
		}		
		
		for(int ind = 0 ; ind <= arr.length - 1 ; ind++){
			if(arr[ind] != 0){
				System.out.println(ind + " --> " + arr[ind]);
			}
			
		}
		
		System.out.println("Enter a string : ");
		String str = sc.next() ;
		
		str = str.toLowerCase() ;
		
		int[] strArr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0} ;
		
		for(int ind = 0 ; ind <= str.length() - 1 ; ind++){
			int value = str.charAt(ind) - 97 ;
			if((value >= 0) && (value <= 25)){
				strArr[value]++;
			}
		}
		
		for(int ind = 0, i = 97 ; ind < strArr.length ; ind++, i++){
			if(strArr[ind] != 0){
				char value = (char)i ;
				System.out.print(value + "-" + strArr[ind]);
			}
			
		}
		
		
		sc.close();
	}

}

package com.learning.numbers;

public class ReverseNumber {

	public static void main(String[] args) {
		int number = 123 ;
		int sum = 0 ;
		int remainder = 0 ;
		boolean flag = false ;
		
		if(number < 0) {
			number = number * -1 ;
			flag = true ;
		}
		
		while(number != 0) {
			remainder = number % 10 ;
			number = number / 10 ;
			sum = sum * 10 + remainder ;
		}
		
		if(flag) {
			sum = sum * -1 ;
		}

		System.out.println("Reverse Number : " + sum);
	}

}

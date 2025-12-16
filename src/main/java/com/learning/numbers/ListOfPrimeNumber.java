package com.learning.numbers;

public class ListOfPrimeNumber {

	public static void main(String[] args) {
		int num = 17 ;
		boolean flag = true ;
		
		for(int j = num ; j > 1 ; j--) {
			for(int i = 2 ; i < j ; i++) {
				if((j % i) == 0) {
					flag = false ;
					break ;
				}
			}
		
			if(flag) {
				System.out.println(j + " is prime number");
				flag = true ;
			}
			flag = true ;
		}

	}

}

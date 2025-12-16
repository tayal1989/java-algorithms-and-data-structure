package com.learning.numbers;

public class FibonacciSeries {

	public static void main(String[] args) {
		int number = 10 ;
		
		for(int i = 1 ; i <= number ; i++) {
			System.out.println(fibRecursive(i));
		}
		
		for(int i = 1 ; i <= number ; i++) {
			System.out.println(fibIterative(i));
		}
	}

	private static int fibRecursive(int n) {
		if(n == 1) {
			return 0 ;
		} else if(n == 2) {
			return 1 ;
		} else {
			return fibRecursive(n - 1) + fibRecursive(n - 2) ;
		}
	}
	
	private static int fibIterative(int n) {
		int a = 0 ;
		int b = 1 ;
		int sum = 1 ;
		
		if(n == 1) {
			return 0 ;
		} else if(n == 2) {
			return 1 ;
		} else {
			for(int i = 2 ; i < n ; i++) {
				sum = a + b ;
				a = b ;
				b = sum ;
			}
		}
		
		return sum ;
	}

}

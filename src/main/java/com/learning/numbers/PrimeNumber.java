package com.learning.numbers;

import java.util.Scanner;

public class PrimeNumber {

	private static boolean flag = true ;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the number : ") ;
		int number = sc.nextInt() ;
		
		double squareRoot = Math.sqrt(number) ;
		
		int i = 2 ;
		
		if(number == 2){
			System.out.println("Prime Number");
			System.exit(0) ;
		}else if(number < 2){
			System.out.println("Not prime number");
			System.exit(0) ;
		}
		
		while(i <= squareRoot) {
			if((number % i) == 0){
				flag = false ;
				break ;
			}
			i++ ;
		}
		
		if(flag == false) {
			System.out.println("Number is not prime");
		} else {
			System.out.println("Number is prime");
		}
		
		sc.close();
		
	}

}

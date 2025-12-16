package com.learning.numbers;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for factorial : ");
		int number = sc.nextInt();
		int product = 1 ;
		
		while(number != 0){
			product = product * number ;
			number--;
		}
		
		System.out.println("Factorial is : " + product);
		
		sc.close();
	}

}

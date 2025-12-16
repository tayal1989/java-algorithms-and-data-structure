package com.learning.numbers;

import java.util.Scanner;

public class PatternOfNumbers {

	public static void main(String[] args) {
		// 1234554321
		// 1234**4321
		// 123****321
		// 12******21
		// 1********1
		
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Input - ");
		int limit = sc.nextInt() ;

		System.out.println("Output - ");
		for(int i = 0 ; i < limit ; i++) {
			for(int j = 1 ; j < ((limit + 1) - i); j++) {
				System.out.print(j);
			}
			
			for(int j = 0 ; j < i * 2 ; j++) {
				System.out.print("*");
			}
			
			for(int j = limit - i ; j > 0 ; j--) {
				System.out.print(j);
			}
			
			System.out.println();
		}
		
		sc.close();
	}

}

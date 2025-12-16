package com.learning.numbers;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		System.out.println("Enter the power : ");
		int power = sc.nextInt();
		int product = 1;
		
		System.out.print(number + " to the power of " + power + " is : ");
		
		while(power != 0){
			product = product * number ;
			power--;
		}
		
		System.out.print(product);
		sc.close();
	}

}

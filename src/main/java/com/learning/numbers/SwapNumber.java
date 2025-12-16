package com.learning.numbers;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Raghav ji, please enter first number :-- ");
		short firstNumber = sc.nextShort();
		
		System.out.println("Raghav ji, please enter second number :-- ");
		short secondNumber = sc.nextShort();		
		
		System.out.println("Raghav ji, first number is : " + firstNumber + " and second number is : " + secondNumber);
		
		secondNumber = (short) (secondNumber - firstNumber) ;
		firstNumber = (short) (firstNumber + secondNumber) ;
		secondNumber = (short) (firstNumber - secondNumber) ;
		
		System.out.println("Raghav ji, after swapping, first number is : " + firstNumber + " and second number is : " + secondNumber);
		
		sc.close();
	}

}

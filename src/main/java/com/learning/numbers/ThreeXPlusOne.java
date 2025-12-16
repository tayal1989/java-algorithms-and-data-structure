package com.learning.numbers;

import java.util.Scanner;

public class ThreeXPlusOne {
	
	static int counter = 1 ;
	
	public static int logicCode(int num){

		while(num != 1){
			if(num == 1){
				break;
			}else if((num % 2) == 0){
				num = num / 2;
				System.out.println(num);
				counter++;
			}else{
				num = (num * 3) + 1;
				System.out.println(num);
				counter++;
			}
		}		
		
		return counter;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ---");
		int number = sc.nextInt();
		int result = logicCode(Math.abs(number));
		System.out.println("Result of the problem :---" + result);
		sc.close();
	}

}

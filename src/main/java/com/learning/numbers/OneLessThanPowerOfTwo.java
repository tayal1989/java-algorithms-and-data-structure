package com.learning.numbers;

import java.util.Scanner;

public class OneLessThanPowerOfTwo {
	
	static boolean flag = false ;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int value = sc.nextInt();
		int prodValue = 1 ;
		
		
		while(true){
			if(value == 0){				
				flag = true ;
			}
			
			prodValue = prodValue * 2 ;
			
			if(value == (prodValue - 1)){
				flag = true ;
			}
			
			if(prodValue > value){
				break ;
			}
		}
		
		if (flag == true){
			System.out.println("Value is 1 less than power of 2") ;
		} else {
			System.out.println("Invalid");
		}
		
		sc.close();
	}

}

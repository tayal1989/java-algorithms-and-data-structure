package com.learning.numbers;

public class DivideTwoIntWithoutUsingDivideMultipilication {

	public static void main(String[] args) {
		int dividend = 10;
		int divisor = 3;
		
		System.out.println("Solution : " + divide(dividend, divisor));
	}
	
	public static int divide(int dividend, int divisor) {
		int quotient = 0;
		boolean signDividend = false;
		boolean signDivisor = false;
		
		if(divisor < 0) {
			divisor = -divisor;
			signDivisor = true;
		}
		
		if(dividend < 0) {
			dividend = -dividend;
			signDividend = true;
		}
		
		while(dividend >= divisor) {
			dividend = dividend - divisor;
			++quotient;
		}
		
		if(signDivisor || signDividend) {
			quotient = -quotient;
		}
		
		if(signDividend && signDivisor) {
			quotient = -quotient;
		}
		
		return quotient;
	}

}

package com.learning.complexity;

public class TimeComplexity {

	public static void main(String[] args) {
		double now = System.currentTimeMillis();
		System.out.println(findSum(999999));
		double then = System.currentTimeMillis();
		System.out.println("Time taken by complexity O(1) is : " + (then - now) + " milliseconds.");
		
		now = System.currentTimeMillis();
		System.out.println(findSumUsingForLoop(999999));
		then = System.currentTimeMillis();
		System.out.println("Time taken by complexity O(n) is : " + (then - now) + " milliseconds.");
	}
	
	public static long findSum(int n) {
		return (n/2) * (n + 1);
	}
	
	public static long findSumUsingForLoop(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
	}
}

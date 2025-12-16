package com.learning.stacks;

import java.util.Stack;

public class GetMiddleElementInStack {	
	
	public static void main(String[] args) {
		int[] data = {10, 20, 30, 40, 50, 60, 70} ;
		
		Stack<Integer> stack = new Stack<Integer>() ;

		int i = 0, current = 0, midElement = 0 ;
		while(i != data.length) {
			stack.push(data[i]) ;
			i++ ;
		}
		
		int lenOfStack = stack.size() ;
		
		System.out.print("Stack elements : ");
		while(! stack.isEmpty()) {
			if(lenOfStack / 2 != current) {
				System.out.print(stack.pop() + " ");
			} else {
				midElement = stack.pop();
			}
			current++ ;
		}
		
		System.out.print("\nMid Element in Stack : " + midElement);
	}
}



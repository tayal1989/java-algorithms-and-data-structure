package com.learning.stacks;

import java.util.Stack;

public class StackMethods {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		int[] arr = {3, 4, 1, 5, 2};
		
		for(int i = 0; i < arr.length; i++) {
			stack.push(arr[i]);
		}
		
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.capacity());
		System.out.println(stack.isEmpty());
		System.out.println(stack.search(3));
		System.out.println(stack.search(26));
	}

}

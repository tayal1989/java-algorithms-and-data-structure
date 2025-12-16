package com.learning.stacks;

import java.util.Stack;

public class StackFunctions {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		int[] arr = {3, 4, 1, 5, 2};
		
		for(int i = 0; i < arr.length; i++) {
			stack.push(arr[i]);
		}
		
		System.out.println("Stack Elements : " + stack);
		
		findMiddleElement(stack);
		
		for(int i = 0; i < arr.length; i++) {
			stack.push(arr[i]);
		}
		
		findMinElement(stack);
		
		for(int i = 0; i < arr.length; i++) {
			stack.push(arr[i]);
		}
		
		reverseOfStack(stack);
	}
	
	private static void reverseOfStack(Stack<Integer> stack) {
		System.out.print("Reverse of stack : ");
		int stackSize = stack.size();
		for(int i = 0; i < stackSize; i++) {
			System.out.print(stack.pop() + " ");
		}
	}

	private static void findMinElement(Stack<Integer> stack) {
		int min = stack.pop();
		for(int i = 0; i < stack.size(); i++) {
			int value = stack.pop();
			if(min > value) {
				min = value;
			}
		}
		System.out.println("Min element in stack : " + min);
		stack.clear();
	}

	public static void findMiddleElement(Stack<Integer> stack) {
		int stackSize = stack.size();
		for(int i = 0; i < stack.size(); i++) {
			if(i == stackSize/2) {
				System.out.println("Middle element of stack : " + stack.peek());
			} else {
				stack.pop();
			}
		}
		stack.clear();
	}

}

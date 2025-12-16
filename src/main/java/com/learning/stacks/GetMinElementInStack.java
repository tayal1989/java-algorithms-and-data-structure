package com.learning.stacks;

import java.util.Stack;

public class GetMinElementInStack {
	
	private int maxSize ;
	private int[] arraySize ;
	private int top ;
	
	private Stack<Integer> min = new Stack<Integer>() ;
	
	public GetMinElementInStack(int size) {
		this.maxSize = size ;
		arraySize = new int[size] ;
		this.top = -1 ;
	}
	
	public void push(int data) {
		if(isFull()) {
			System.out.println("This stack is already full");
		} else if(isEmpty()) {
			top++ ;
			arraySize[top] = data ;
			min.push(data) ;
		} else {
			top++ ;
			arraySize[top] = data ;
			
			int y = min.pop() ;
			if(data < y) {
				min.push(data) ;
			} else {
				min.push(y) ;
			}
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("No more element in stack");
			return -1 ;
		} else {
			int data = arraySize[top] ;
			top-- ;
			return data ;
		}
	}
	
	public int peek() {
		return arraySize[top] ;
	}
	
	public boolean isFull() {
		return top == maxSize - 1 ;
	}
	
	public boolean isEmpty() {
		return top == -1 ;
	}
	
	public int getMin() {
		return min.peek() ;
	}
	
	public static void main(String[] args) {
		int[] data = {10, 20 , 5} ;
		
		GetMinElementInStack bsp = new GetMinElementInStack(data.length);
		
		int i = 0 ;
		while(! bsp.isFull()) {
			bsp.push(data[i]);
			i++ ;
			System.out.println("Get Minimum Element : " + bsp.getMin());
		}
	}
}


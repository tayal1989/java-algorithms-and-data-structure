package com.learning.stacks;

public class BasicStackPrograms {
	
	private int maxSize ;
	private int[] arraySize ;
	private int top ;
	
	public BasicStackPrograms(int size) {
		this.maxSize = size ;
		arraySize = new int[size] ;
		this.top = -1 ;
	}
	
	public void push(int data) {
		if(isFull()) {
			System.out.println("This stack is already full");
		} else {
			top++ ;
			arraySize[top] = data ;
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
	
	public static void main(String[] args) {
		BasicStackPrograms bsp = new BasicStackPrograms(3);
		
		System.out.println("Is empty : " + bsp.isEmpty());
		
		bsp.push(10);
		
		bsp.push(20);
		System.out.println("Is full : " + bsp.isFull());
		
		bsp.push(5);
		
		System.out.println("Is full : " + bsp.isFull());
		System.out.println("Is empty : " + bsp.isEmpty());
		
		System.out.println("Peek element : " + bsp.peek());
		System.out.println("Peek element : " + bsp.peek());
		System.out.println("Pop element : " + bsp.pop());
		
		System.out.println("Peek element : " + bsp.peek());
		System.out.println("Pop element : " + bsp.pop());
		
		System.out.println("Peek element : " + bsp.peek());
		System.out.println("Pop element : " + bsp.pop());
		
		System.out.println("Is empty : " + bsp.isEmpty());
	}
}

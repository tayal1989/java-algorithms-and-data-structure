package com.learning.stacks;

public class ReverseStringInStack {
	
	private int maxSize ;
	private char[] arraySize ;
	private int top ;
	
	public ReverseStringInStack(int size) {
		this.maxSize = size ;
		arraySize = new char[this.maxSize] ;
		top = -1 ;
	}
	
	public void push(char ch) {
		top++ ;
		arraySize[top] = ch ;
	}
	
	public char pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return '0' ;
		} else {
			char data = arraySize[top] ;
			top-- ;
			return data ;
		}
	}
	
	public boolean isEmpty() {
		return top == -1 ;
	}
	
	public boolean isFull() {
		return top == maxSize - 1 ;
	}

	public static void main(String[] args) {		
		char[] ch = {'n', 'a', 'i', 'n', 'a'} ;
		
		ReverseStringInStack rs = new ReverseStringInStack(ch.length) ;
		
		for(int i = 0 ; !rs.isFull() ; i++) {
			rs.push(ch[i]);
		}

		while(!rs.isEmpty()) {
			System.out.print(rs.pop());
		}
	}

}

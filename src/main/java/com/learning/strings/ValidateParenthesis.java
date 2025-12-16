package com.learning.strings;

import java.util.Stack;

public class ValidateParenthesis {

	public static void main(String[] args) {
		String str = "([{}])" ;
		System.out.println(validParenthesis(str)) ;
	}

	private static boolean validParenthesis(String str) {
		Stack<Character> stack = new Stack<Character>();
		char sc = '\0' ;
		char[] ch = str.toCharArray() ;
		
		for(int i = 0 ; i < ch.length ; i++) {
			if(ch[i] == '(' || ch[i] == '{' || ch[i] == '[') {
				stack.push(ch[i]) ;
			}
			
			if(stack.isEmpty()) {
				return false ;
			}
			
			if(ch[i] == ')') {
				sc = stack.pop() ;
				if(sc == '{' || sc == '[') {
					return false ;
				}
			} else if(ch[i] == '}') {
				sc = stack.pop() ;
				if(sc == '(' || sc == '[') {
					return false ;
				}
			} else if(ch[i] == ']') {
				sc = stack.pop() ;
				if(sc == '{' || sc == '(') {
					return false ;
				}
			}
		}
		
		return stack.isEmpty();
	}

}

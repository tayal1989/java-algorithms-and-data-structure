package com.learning.numbers;

public class ColumnNumberFromColumnTitle {

	public static void main(String[] args) {
		
		String columnTitle = "CDA";
		int sum = 0;
		
		for(int i = 0 ; i < columnTitle.length() ; i++) {
			sum = sum * 26;
			sum = sum + columnTitle.charAt(i) - 'A' + 1;
		}
		
		System.out.println("Column Number : " + sum);
	}

}

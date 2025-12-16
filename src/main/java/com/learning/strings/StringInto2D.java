package com.learning.strings;

import java.util.ArrayList;
import java.util.List;

public class StringInto2D {

	public static void main(String[] args) {
		//"5,100,5.5,101,6,102:L10;5,99,5.5,100,6,101:L20;5,89,5.5,90,6,91:L30;"
		//		10		20
		//5		100		99
		//5.5	101		100
		//6		102		101
		
		// Group by with having and count operation
		String str = "5,100,5.5,101,6,102:L10;5,99,5.5,100,6,101:L20;5,89,5.5,90,6,91:L30;" ;
		String[] headers = str.split(";");
		List<String> rows = new ArrayList<String>() ;
		List<String> header = new ArrayList<String>() ;
		
		// Finding header
		for(int i = 0 ; i < headers.length ; i++) {
			header.add(headers[i].split(":L")[1]);
		}
		
		// Adding space in 1st column and 1st row
		header.add(0, "   ");
		
		// Printing header
		for(int j = 0 ; j < header.size() ; j++) {
			System.out.print(header.get(j) + "   ");
		}
		
		// Finding each row
		for(int i = 0 ; i < headers.length ; i++) {
			rows.add(headers[i].split(":")[0]);
		}
		
		String[][] outputArr = new String[headers.length][headers.length + 1] ;
		
		int count = 0 ;
		
		for(int i = 0 ; i < rows.size() ; i++) {
			for(int j = 0 ; j < rows.get(i).split(",").length ; j++) {
				// If it is 1st row as we have to get header for each row
				if(j % 2 == 0 && i == 0) {
					outputArr[count][0] = rows.get(i).split(",")[j] ;
					outputArr[count][1] = rows.get(i).split(",")[j + 1] ;	
					count++ ;
				} else if(j % 2 == 0) {
					outputArr[count][i + 1] = rows.get(i).split(",")[j + 1] ;	
					count++ ;
				}				
			}
			count = 0 ;
		}
		
		System.out.println();
		
		// Print 2 d array
		for(int i = 0 ; i < outputArr.length ; i++) {
			for(int j = 0 ; j < outputArr[i].length ; j++) {
				System.out.print(outputArr[i][j] + "   ");
			}
			System.out.println();
		}
	}
}

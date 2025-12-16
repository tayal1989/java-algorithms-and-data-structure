package com.learning.numbers;

public class FillNumberSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "1..5,10,12..15,21,26,30..32,33,34..45" ;
		String[] actualStr = str.split(",") ;
		String[] indStr ;
		
		
		for(int i = 0 ; i < actualStr.length ; i++){
			if(actualStr[i].contains("..")){
				indStr = actualStr[i].split("[\\D]+") ;
				
				String part1 = indStr[0] ;
				String part2 = indStr[1] ;
				
				int val1 = Integer.parseInt(part1) ;
				int val2 = Integer.parseInt(part2) ;
				while(val1 <= val2){
					System.out.print(val1 + ",");
					val1++;
				}
						
			} else {
				System.out.print(actualStr[i] + ",");
			}
		}
		
		String str1 = "Vishal" ;
		System.out.println();
		System.out.println(str1.substring(0, str1.length() - 1));
	}

}

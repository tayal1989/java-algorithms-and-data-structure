package com.learning.practise;

/**
 * <h1>Patterns.java</h1>
 * The Patterns.java program implements an application that generates different patterns
 * for interview purpose.
 * 
 * <p>
 * Giving proper comments in your program makes it more
 * user friendly and it is assumed as a high quality code.
 *
 *
 * @author	Vishal Agarwal
 * @version	1.0
 * @date		29-Aug-2016
 */

public class Patterns {

	public static void main(String[] args) {
		
		System.out.println("\nFirst Pattern\n");
		/*
		 * 1st Pattern
		 * 1       
			1 2      
			1 2 3     
			1 2 3 4    
			1 2 3 4 5   
			1 2 3 4 5 6  
			1 2 3 4 5 6 7 
		 */
		for(int i = 1 ; i < 8 ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print(j + " ");
			}		
			
			System.out.println();
		}

		System.out.println("\n\nSecond Pattern\n");
		
		/*
		 * 2nd Pattern
		 * 1 1 1 1 1 1 1
		 * 1 1 1 1 1 2 2
		 * 1 1 1 1 3 3 3
		 * 1 1 1 4 4 4 4
		 * 1 1 5 5 5 5 5
		 * 1 6 6 6 6 6 6
		 * 7 7 7 7 7 7 7
		 */
		
		for(int i = 1 ; i < 8 ; i++) {
			for(int j = 7 ; j > i; j--) {
				System.out.print("1 ");
			}
			
			for(int j = 0; j < i; j++) {
				System.out.print(i + " ");
			}
			
			System.out.println();
		}
		
		System.out.println("\n\nThird Pattern\n");
		/*
		 * 3rd Pattern
		 * 1       
			1 2      
			1 2 3     
			1 2 3 4    
			1 2 3 4 5   
			1 2 3 4 5 6  
			1 2 3 4 5 6 7
			1 2 3 4 5 6
			1 2 3 4 5
			1 2 3 4
			1 2 3
			1 2
			1
		 */
		for(int i = 1 ; i < 8 ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print(j + " ");
			}		
			
			System.out.println();
		}
		
		for(int i = 1 ; i < 7 ; i++) {
			for(int j = 1 ; j <= 7 - i ; j++) {
				System.out.print(j + " ");
			}		
			
			System.out.println();
		}
		
		System.out.println("\n\nFourth Pattern\n");
		/*
		 * 4th Pattern
		 *  1 2 3 4 5 6 7
			1 2 3 4 5 6
			1 2 3 4 5
			1 2 3 4
			1 2 3
			1 2
			1     
			1 2      
			1 2 3     
			1 2 3 4    
			1 2 3 4 5   
			1 2 3 4 5 6
			1 2 3 4 5 6 7
		 */
		
		for(int i = 1 ; i < 8 ; i++) {
			for(int j = 1 ; j <= 8 - i ; j++) {
				System.out.print(j + " ");
			}		
			
			System.out.println();
		}
		
		for(int i = 2 ; i < 8 ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print(j + " ");
			}		
			
			System.out.println();
		}
		
		
		System.out.println("\n\nFifth Pattern\n");
		/*
		 * 5th Pattern
		 *  7 6 5 4 3 2 1
			7 6 5 4 3 2
			7 6 5 4 3
			7 6 5 4
			7 6 5
			7 6
			7
		 */
		
		for(int i = 1 ; i < 8 ; i++) {
			for(int j = 7 ; j >= i ; j--) {
				System.out.print(j + " ");
			}		
			
			System.out.println();
		}
		
		System.out.println("\n\nSixth Pattern\n");
		
		/*
		 * 6th Pattern
		 * 7
		 * 7 6
		 * 7 6 5
		 * 7 6 5 4
		 * 7 6 5 4 3
		 * 7 6 5 4 3 2
		 * 7 6 5 4 3 2 1
		 */
		for(int i = 7 ; i > 0 ; i--) {
			for(int j = 7 ; j >= i ; j--) {
				System.out.print(j + " ");
			}		
			
			System.out.println();
		}
		
		
		System.out.println("\n\nSeventh Pattern\n");
		
		/*
		 * 7th Pattern
		 * 1
		 * 1 2 1
		 * 1 2 3 2 1
		 * 1 2 3 4 3 2 1
		 * 1 2 3 4 5 4 3 2 1
		 * 1 2 3 4 5 6 5 4 3 2 1
		 * 1 2 3 4 5 6 7 6 5 4 3 2 1
		 */
		for(int i = 1 ; i <= 7 ; i++) {
			int j ;
			for(j = 1 ; j <= i  ; j++) {
				System.out.print(j + " ");
			}
			
			--j ;
			--j ;
			
			for(; j >= 1  ; j--) {
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
		
		System.out.println("\n\nEighth Pattern\n");
		
		/*
		 * 8th Pattern
		 * 1 2 3 4 5 6 7
		 *    2 3 4 5 6 7
		 *       3 4 5 6 7
		 *          4 5 6 7
		 *             5 6 7
		 *                6 7
		 *                   7
		 *                6 7
		 *             5 6 7
		 *          4 5 6 7
		 *       3 4 5 6 7
		 *    2 3 4 5 6 7
		 * 1 2 3 4 5 6 7 
		 */
		for(int i = 0 ; i < 7 ; i++) {
			
			for(int j = 0 ; j < i  ; j++) {
				System.out.print("   ");
			}
			
			for(int j = i ; j < 7  ; j++) {
				System.out.print(j + 1 + " ");
			}			
			
			System.out.println();
		}
		
		for(int i = 7 ; i > 1 ; i--) {
			
			for(int j = i ; j > 2  ; j--) {
				System.out.print("   ");
			}
			
			for(int j = i - 1 ; j <= 7  ; j++) {
				System.out.print(j + " ");
			}			
			
			System.out.println();
		}
		
		
		System.out.println("\n\nNinth Pattern\n");
		
		/*
		 * 9th Pattern
		 *  1 2 3 4 5 6 7 
			  2 3 4 5 6 7 
			   3 4 5 6 7 
			    4 5 6 7 
			     5 6 7 
			      6 7 
			       7 
			     6 7 
			    5 6 7 
			   4 5 6 7 
			  3 4 5 6 7 
			 2 3 4 5 6 7 
			1 2 3 4 5 6 7 
		 */
		for(int i = 1 ; i <= 7 ; i++) {
			
			for(int j = 0 ; j < i  ; j++) {
				System.out.print(" ");
			}
			
			for(int j = i ; j <= 7  ; j++) {
				System.out.print(j + " ");
			}			
			
			System.out.println();
		}
		
		for(int i = 7 ; i > 1 ; i--) {
			
			for(int j = i ; j > 2  ; j--) {
				System.out.print(" ");
			}
			
			for(int j = i - 1 ; j <= 7  ; j++) {
				System.out.print(j + " ");
			}			
			
			System.out.println();
		}
		
		
		System.out.println("\n\nTenth Pattern\n");
		
		/*
		 * 10th Pattern
		 *  1
			10
			101
			1010
			10101
			101010
			1010101 
		 */
		for(int i = 1 ; i <= 7 ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				if(j % 2 == 0) {
					System.out.print("0");
				} else {
					System.out.print("1");
				}
			}
			
			System.out.println();
		}
		
		System.out.println("\n\nEleventh Pattern\n");
		
		/*
		 * 11th Pattern
		 *  1010101
			0101010
			1010101
			0101010
			1010101
			0101010
			1010101 
		 */
		for(int i = 1 ; i <= 7 ; i++) {
			if(i % 2 == 0) {
				for(int j = 1 ; j <= 7 ; j++) {
					if(j % 2 == 0) {
						System.out.print("0");
					} else if(j % 2 != 0) {
						System.out.print("1");
					}
				}
			} else {
				for(int j = 1 ; j <= 7 ; j++) {
					if(j % 2 == 0) {
						System.out.print("1");
					} else if(j % 2 != 0) {
						System.out.print("0");
					}
				}
			}
			
			System.out.println();
		}
		
		System.out.println("\n\nTwelveth Pattern\n");
		
		/*
		 * 12th Pattern
		 *  1
			2 6
			3 7 10
			4 8 11 13
			5 9 12 14 15 
		 */
		for(int i = 1 ; i <= 5 ; i++) {
			int add = 4 ;
			int sum = i ;
			for(int j = 1 ; j <= i ; j++) {
				if(j == 1) {
					System.out.print(sum + " ");
				} else {
					sum = sum + add ;
					System.out.print(sum + " ");
					add-- ;
				}
			}			
			
			System.out.println();
		}
		
		
		System.out.println("\n\nThirteenth Pattern\n");
		
		/*
		 * 12th Pattern
		 *  0000000
			0100000
			0020000
			0003000
			0000400
			0000050
			0000006 
		 */
		for(int i = 1 ; i <= 6 ; i++) {
			for(int j = 1 ; j <= 6 ; j++) {
				if(j == i) {
					System.out.print(i);
				} else {
					System.out.print("0");
				}
			}
			
			System.out.println();
		}
		
		
		System.out.println("\n\nFourteenth Pattern\n");
		
		/*
		 * 14th Pattern
		 *                    1
		 *                 1 2
		 *              1 2 3 
		 *           1 2 3 4
		 *        1 2 3 4 5 
		 *     1 2 3 4 5 6
		 *  1 2 3 4 5 6 7   
		 */
		for(int i = 1 ; i <= 7 ; i++) {
			for(int j = 7 ; j > i ; j--) {
				System.out.print("  ");
			}
			
			for(int j = 1 ; j <= i; j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}
	}

}

package com.learning.numbers;

/**
 * Ugly numbers are numbers whose only prime factors are 2, 3 or 5. The sequence
 * 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15,
 * shows the first 11 ugly numbers. By convention, 1 is included.
 * Write a program to find and print the 150th ugly number
 * @author vishal
 *
 */
public class UglyNumber {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int count = 1;
		int div = 2, div1 = 2;
		int num = 2;
		//System.out.println(count + " --> 1" );
		
		while(count <= 1499){		
			
			while(num != 1){
				
				if((num % 2) == 0){					
					num = div1 / 2;
					div1 = div1 / 2 ;
					
					if(num == 1){						
						count++;
						if(count == 1500){
							System.out.println("1500th ugly number is : " + div);
						}
						num = 2 ;
						break;
					}					
					
				}else if((num % 3) == 0){
					num = div1 / 3;
					div1 = div1 / 3 ;
					
					if(num == 1){
						count++;
						if(count == 1500){
							System.out.println("1500th ugly number is : " + div);
						}
						break;
					}
					
				}else if((num % 5) == 0){
					num = div1 / 5;
					div1 = div1 / 5 ;
					
					if(num == 1){						
						count++;
						if(count == 1500){
							System.out.println("1500th ugly number is : " + div);
						}
						num = 2 ;
						break;
					}
					
				}else{
					num = 2;
					break;
				}
			}
			div++;
			num  = div;
			div1 = div;
		}		
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Time taken by program : " + totalTime/1000);
	}

}

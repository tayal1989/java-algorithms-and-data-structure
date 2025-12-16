package com.learning.arrays;

/**
 * <h1>Spiral</h1>
 * The Spiral.java program will print a given matrix in spiral form
 * 
 * <p>
 * For example : <br>
 * Input: <br>
 *     1    2   3   4 <br>
 *     5    6   7   8 <br>
 *     9   10  11  12 <br>
 *    13  14  15  16 <br>
 * Output: <br>
 * 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 <br> 
 *
 *
 * Input: <br>
 *       1   2   3   4  5   6 <br>
 *       7   8   9  10  11  12 <br>
 *       13  14  15 16  17  18 <br>
 * Output:  <br>
 * 1 2 3 4 5 6 12 18 17 16 15 14 13 7 8 9 10 11 <br>
 * 
 * @author	Vishal Agarwal
 * @version	1.0
 * @date		22-Dec-2015
 * @category O(n)
 */

public class Spiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows : ");
		int rowNo = sc.nextInt();
		
		System.out.println("Enter the no of cols : ");
		int colNo = sc.nextInt();
		
		int[][] spiralArr = new int[rowNo][colNo];
		
		System.out.println("Enter the numbers : ");
		
		for(int row = 0; row < rowNo; row++){
			for(int col = 0; col < colNo; col++){
				spiralArr[row][col] = sc.nextInt();
			}
		}
		*/
		
		int[][] spiralArr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}; // 4*4
		//int[][] spiralArr = new int[][]{{1,2,3},{4,5,6},{7,8,9}};	//3*3
		int row, col, rowNo = 4, colNo = 4 ;
		//int row, col, rowNo = 3, colNo = 3 ;
		
		int[] outputArr = new int[rowNo * colNo];
		
		for(row = 0; row < rowNo; row++){
			for(col = 0; col < colNo; col++){
				System.out.print(spiralArr[row][col] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nSpiral array for " + rowNo + " by " + colNo + " is :");
		
		int c1 = 0, c2 = colNo - 1, r1 = 0, r2 = rowNo - 1, count = 1 ;
		int m = 0;
		
		while(count <= ((rowNo * colNo))){
			for(int i = c1; i <= c2; i++){
				outputArr[m] = spiralArr[r1][i];
				count++;
				//System.out.println(outputArr[m][n]);
				m++;
			}
			
			for(int j = r1 + 1; j <= r2; j++){
				outputArr[m] = spiralArr[j][c2];
				count++;
				m++;
			}
			
			for(int i = c2 - 1; i >= c1; i--){
				outputArr[m] = spiralArr[r2][i]; 
				count++;
				m++;
			}
			
			for(int j = r2 - 1; j >= r1 + 1; j--){
				outputArr[m] = spiralArr[j][c1];
				count++;
				m++;
			}
			
			c1++;
			c2--;
			r1++;
			r2--;
		}
		
		for(col = 1; col < ((rowNo * colNo) + 1); col++){
			System.out.print(outputArr[col - 1] + " ");
			if((col % colNo) == 0){
				System.out.println();
			}
		}
			
		
		
		//sc.close();
	}

}

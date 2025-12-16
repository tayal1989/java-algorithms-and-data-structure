package com.learning.strings;

import java.util.Scanner;

class CountLengthOfString{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name =>" +"  ");
        String ab = sc.nextLine();
        System.out.println("\nName Length is:" +len(ab));
        System.out.println("\nName Length by 2nd method is: " +findLength(ab));
        sc.close();
    }
    
    public static int findLength(String ab){
    	int count = 0;
    	for(char c : ab.toCharArray()){
    		count++ ;
    	}
    	
    	return count;
    }

    public static int len(String ab){
        char[] ac = ab.toCharArray();
        int i = 0, k = 0;

        try{
            for(i=0, k=0; ac[i]!='\0'; i++){
                k++;
            }
        }catch(Exception e){
        }
        
        return k;
    }
}

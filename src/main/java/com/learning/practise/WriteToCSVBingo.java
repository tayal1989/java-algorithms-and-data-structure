/**
 * 
 */
package com.learning.practise;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author v4agarwa 14-Dec-2015
 */
public class WriteToCSVBingo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int size = 25;
		int count = 1;

		ArrayList<Integer> list = new ArrayList<Integer>(size);
		FileWriter writer = new FileWriter("D:\\Bingo.csv");
		
		for(int ind = 1 ; ind < 71 ; ind++){
		
			for (int i = 1; i <= size; i++) {
				list.add(i);
			}
	
			try{			    
			    Random rand = new Random();
			    
			    while(list.size() > 0) {
			    	int index = rand.nextInt(list.size());
			        writer.append(list.remove(index) + ",");
			        if((count % 5) == 0) {
			         	writer.append("\n");            	
			        }
			        count++ ;
			    }
		        
			} catch(IOException e) {
			     e.printStackTrace();
			}
			writer.append("\n\n");
		}
		
		writer.flush();
	    writer.close();
	}

}

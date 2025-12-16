package com.learning.filereadandwrite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class RemoveCommonLinesBetweenTwoFiles {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("def.txt"));			
			PrintWriter pw = new PrintWriter("xyz.txt");			
			String line = br.readLine();
			
			while(line != null) {
				BufferedReader br2 = new BufferedReader(new FileReader("ghi.txt"));
				String line2 = br2.readLine();
				boolean available = false ;
				while(line2 != null) {
					if(line.equals(line2)) {
						available = true ;
						break ;
					}
					line2 = br2.readLine();
				}
				
				if(!available) {
					pw.println(line);
					pw.flush();
				}
				
				line = br.readLine();
			}
			br.close();
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

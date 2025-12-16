package com.learning.filereadandwrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExplainingFileFunctions {

	public static void main(String[] args) {
		try {
			// Explaining File
			File f = new File("abc.txt");
			System.out.println(f.exists());		
			f.createNewFile();	// Creates abc.txt file
			System.out.println(f.exists());
			f.delete();
			System.out.println(f.exists());
			
			File f1 = new File("target");
			System.out.println(f1.exists());
			
			File f2 = new File("src");
			String[] s = f2.list();
			
			for(String s1 : s) {
				System.out.println(s1);
			}
			
			// Explaining Buffered Writer
			File file = new File("def.txt");
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(100);
			bw.newLine();
			char[] ch = {'a', 'b', 'c'} ;
			bw.write(ch);
			bw.newLine();
			bw.write("Vishal");
			bw.flush();
			bw.close();
			
			// Explaining Buffered Reader
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			br.close();
			
			// Explaining Print Writer
			File filePrintWriter = new File("ghi.txt");
			FileWriter fwPrintWriter = new FileWriter(filePrintWriter);
			PrintWriter pw = new PrintWriter(filePrintWriter);
			pw.println(true);
			pw.println('a');
			pw.println("Vishal");
			pw.println(100);
			pw.println(120.01);
			fwPrintWriter.close();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

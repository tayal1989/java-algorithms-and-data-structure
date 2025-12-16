package com.learning.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketClient {

	public static void main(String[] args) throws IOException {
		String ip = "localhost";
		int port = 9999;
		Socket s = new Socket(ip, port);
		
		String str = "Vishal Agarwal";
		OutputStreamWriter osw = new OutputStreamWriter(s.getOutputStream());
		PrintWriter pw = new PrintWriter(osw);
		pw.println(str);
		pw.flush();
//		s.close();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String nickname = br.readLine();
		
		System.out.println("C : Server Data : " + nickname);
	}

}

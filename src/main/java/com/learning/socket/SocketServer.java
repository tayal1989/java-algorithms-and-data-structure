package com.learning.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
	
	public static void main(String[] args) throws IOException {
		System.out.println("S : Server Started");
		
		ServerSocket ss = new ServerSocket(9999);
		System.out.println("S : Server is waiting for client request");
		
		Socket s = ss.accept();
		System.out.println("S : Client connected");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str = br.readLine();
		
		System.out.println("S : Client Data : " + str);
		
		String nickname = str.substring(0, 4);
		OutputStreamWriter osw = new OutputStreamWriter(s.getOutputStream());
		PrintWriter pw = new PrintWriter(osw);
		pw.println(nickname);
		pw.flush();
		System.out.println("S : Data sent from client to server");
	}
}

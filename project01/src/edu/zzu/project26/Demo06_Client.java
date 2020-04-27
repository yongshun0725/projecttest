package edu.zzu.project26;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Demo06_Client {

	public static void main(String[] args) throws Exception{
 
		Socket socket = new Socket("127.0.0.1", 12345);
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream ps = new PrintStream(socket.getOutputStream());   //printstream有写出换行功能
		
		
		System.out.println(br.readLine());
		ps.println("我想咨询以下");
		System.out.println(br.readLine());
		ps.println("滚犊子");
		socket.close();
	}

}


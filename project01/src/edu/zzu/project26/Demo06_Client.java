package edu.zzu.project26;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Demo06_Client {

	public static void main(String[] args) throws Exception{
 
		Socket socket = new Socket("127.0.0.1", 12345);
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream ps = new PrintStream(socket.getOutputStream());   //printstream��д�����й���
		
		
		System.out.println(br.readLine());
		ps.println("������ѯ����");
		System.out.println(br.readLine());
		ps.println("������");
		socket.close();
	}

}


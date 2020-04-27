package edu.zzu.project26;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Demo07_Test1_Client {

	public static void main(String[] args) throws Exception{
       Scanner sc = new Scanner(System.in);//创建键盘录入对象
       Socket socket = new Socket("127.0.0.1",54321);
       
       BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
       PrintStream ps = new PrintStream(socket.getOutputStream());
       
       ps.println(sc.nextLine());
       
       System.out.println("-------"+br.readLine()+"---------");
       socket.close();
	}

}


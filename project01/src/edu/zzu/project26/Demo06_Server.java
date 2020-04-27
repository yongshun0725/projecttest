package edu.zzu.project26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo06_Server {

	public static void main(String[] args) throws Exception {

		// demo1();
		ServerSocket server = new ServerSocket(12345);

		while (true) {
			final Socket socket = server.accept();
			new Thread() {
				public void run() {
					BufferedReader br;
					try {
						br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
						PrintStream ps = new PrintStream(socket.getOutputStream()); // printstream有写出换行功能

						ps.println("欢迎咨询黑么程序员");
						System.out.println(br.readLine());
						ps.println("不好意思，爆满了");
						System.out.println(br.readLine());
						socket.close();
					} catch (IOException e) {
						e.printStackTrace();
					}

				}
			}.start();

		}
	}

	private static void demo1() throws IOException {
		ServerSocket server = new ServerSocket(12345);
		Socket socket = server.accept();

		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream ps = new PrintStream(socket.getOutputStream()); // printstream有写出换行功能

		ps.println("欢迎咨询黑么程序员");
		System.out.println(br.readLine());
		ps.println("不好意思，爆满了");
		System.out.println(br.readLine());
		socket.close();
	}

}

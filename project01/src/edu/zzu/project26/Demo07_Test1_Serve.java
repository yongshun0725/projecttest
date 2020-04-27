package edu.zzu.project26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo07_Test1_Serve {

	public static void main(String[] args) throws Exception {

		ServerSocket server = new ServerSocket(54321);
		System.out.println("服务器启动，绑定54321端口");
		 
		while(true) {
			final Socket socket = server.accept();
			new Thread() {
				public void run() {
					try {
						BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
						PrintStream ps = new PrintStream(socket.getOutputStream());
						
						String line = br.readLine();
						System.out.println("line:   "+line);
						line = new StringBuilder(line).reverse().toString();
						
						System.out.println(line);
						
						ps.println(line);
						socket.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				       
				}
			}.start();
		}
	}

}


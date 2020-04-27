package edu.zzu.project26;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo08_Test_server {

	public static void main(String[] args) throws Exception{
           ServerSocket server = new ServerSocket(12345);
           System.out.println("服务器启动，绑定12345端口");
           while(true) {
        	   final Socket socket = server.accept();
        	   new Thread() {
        		   public void run() {
        			   try {
        				InputStream is = socket.getInputStream();
						BufferedReader br = new 
								BufferedReader(new InputStreamReader(is));
						PrintStream ps = new PrintStream(socket.getOutputStream());
						
						String name = br.readLine();
						
						File dir = new File("update");
						dir.mkdir();
						File file = new File(dir,name);
						if(file.exists()) {
							ps.println("存在");
							socket.close();
							return;
						}else {
							ps.println("不存在");
							FileOutputStream fos = new FileOutputStream(file);
							byte[] arr = new byte[8192];
							int len;
							
							while((len = is.read(arr)) != -1) {
								fos.write(arr,0,len);
							}
						}
						
					} catch (IOException e) {
						e.printStackTrace();
					}
        		       
        		   }
        	   }.start();
           }
	}

}


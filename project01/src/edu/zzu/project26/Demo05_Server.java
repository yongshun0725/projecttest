package edu.zzu.project26;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo05_Server {

	/**edu.zzu.project26.Demo06_Server
	 * 
	 * @param args   
	 * 2.服务端
	   *   创建ServerSocket(指定端口号)		
	   *   调用ServerSocket的accept()方法接受客户端请求，得到一个socket
	   *   调用socket的getInputStream和getOutputStream方法获得客户端io流
	   *   输入流可读写客户端输出流写出的数据
	   *   输出流可以写入客户端的接受数据
	 *   
	 */
	public static void main(String[] args) throws Exception{

		ServerSocket server = new ServerSocket(12345);
		Socket socket = server.accept();
		 InputStream is = socket.getInputStream();
         OutputStream os = socket.getOutputStream();
         os.write("百度一下你就知道".getBytes());
         byte[] arr = new byte[1024];
         int len = is.read(arr);
         System.out.println("客户端数据："+new String(arr,0,len));
         socket.close();
         
	}

}


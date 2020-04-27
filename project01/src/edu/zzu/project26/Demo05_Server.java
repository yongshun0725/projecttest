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
	 * 2.�����
	   *   ����ServerSocket(ָ���˿ں�)		
	   *   ����ServerSocket��accept()�������ܿͻ������󣬵õ�һ��socket
	   *   ����socket��getInputStream��getOutputStream������ÿͻ���io��
	   *   �������ɶ�д�ͻ��������д��������
	   *   ���������д��ͻ��˵Ľ�������
	 *   
	 */
	public static void main(String[] args) throws Exception{

		ServerSocket server = new ServerSocket(12345);
		Socket socket = server.accept();
		 InputStream is = socket.getInputStream();
         OutputStream os = socket.getOutputStream();
         os.write("�ٶ�һ�����֪��".getBytes());
         byte[] arr = new byte[1024];
         int len = is.read(arr);
         System.out.println("�ͻ������ݣ�"+new String(arr,0,len));
         socket.close();
         
	}

}


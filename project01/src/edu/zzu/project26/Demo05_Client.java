package edu.zzu.project26;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Demo05_Client {

	/**
	 * 
	 * @param args   
	 * 1.�ͻ���
	 *   ����socket���ӷ�����(ָ��ip���˿ں�)��ͨ��ip��ַ�ҵ���Ӧ������
	 *   ����socket��getInputStream()��getOutputStream()�����ͷ�������ӵ�io��
	 */
	public static void main(String[] args) throws Exception{
          Socket socket = new Socket("127.0.0.1", 12345);
          InputStream is = socket.getInputStream();
          OutputStream os = socket.getOutputStream();
          
           byte[] arr = new byte[1024];
           int len = is.read(arr);
           System.out.println("���������ݣ�"+new String(arr,0,len));
           
           os.write("ѧϰ�ھ���ļ�ǿ��".getBytes());
          socket.close();
	}

}


package edu.zzu.project26;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Demo08_Test1Client {

	public static void main(String[] args) throws Exception{
       File file = getFile();
       
       Socket socket = new Socket("127.0.0.1",12345);
       BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
       PrintStream ps = new PrintStream(socket.getOutputStream());
       
       ps.println(file.getName());
       String result = br.readLine();
       if("����".equals(result)) {
    	   System.out.println("���ϴ����ļ��Ѿ����ڣ������ظ��ϴ�������");
    	   socket.close();
    	   return;
       }else {
    	   FileInputStream fis = new FileInputStream(file);
    	   byte[] arr = new byte[8192];
    	   int len;
    	   while((len = fis.read(arr))!= -1) {
    		   ps.write(arr, 0, len);
    	   }
    	   fis.close();
    	   socket.close();
       }
	}

	private static File getFile() {
		Scanner sc = new Scanner(System.in);
		   System.out.println("������һ���ļ�·����");
		   while(true) {
			   String line = sc.nextLine();
			   File file = new File(line);
			   if(!file.exists()) {
				   System.out.println("����·��������");
			   }else if(file.isDirectory()) {
				   System.out.println("����������ļ���·�����������ļ�·��");
			   }else {
				   return file;
			   }
		   }
	}

}


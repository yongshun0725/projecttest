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
       if("存在".equals(result)) {
    	   System.out.println("您上传的文件已经存在，请勿重复上传！！！");
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
		   System.out.println("请输入一个文件路径：");
		   while(true) {
			   String line = sc.nextLine();
			   File file = new File(line);
			   if(!file.exists()) {
				   System.out.println("输入路径不存在");
			   }else if(file.isDirectory()) {
				   System.out.println("您输入的是文件夹路径，请输入文件路径");
			   }else {
				   return file;
			   }
		   }
	}

}


package edu.zzu.project20;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Demo9_Test2 {
	
	/**
	 * 
	 * 从键盘录入数据拷贝到当前目录下的xxx.txt文件中，当键盘录入数据为quit是退出
	 * 
	 * 分析：
	 * 1.创建键盘录入对象
	 * 2.创建输出流对象，关联xxx.txt文件
	 * 3.定义无限循环
	 * 4.遇到quit就停止
	 * 5.如果不是quit就存入
	 * 6.关闭流
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		FileOutputStream fos = new FileOutputStream("xxx.txt");
		fos.write("12121".getBytes());
		fos.write("12121".getBytes());
		fos.write("12121".getBytes());
		fos.write("12121".getBytes());
		fos.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		System.out.println("请输入数据：");
      //1.键盘录入对象
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("xxx.txt");
		
		while(true) {
			String str = sc.nextLine();
			if("quit".equals(str)) {
				break;
			}
			fos.write(str.getBytes());
			fos.write("\r\n".getBytes());
		}
		sc.close();
		fos.close();
	}
}

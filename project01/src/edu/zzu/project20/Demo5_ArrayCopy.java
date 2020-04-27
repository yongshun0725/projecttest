package edu.zzu.project20;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo5_ArrayCopy {
    /*
     * 定义小数组拷贝文件
     * */
	public static void main(String[] args) throws IOException{
		
		FileInputStream fis = new FileInputStream("yyy.txt");
		byte[] b = new byte[2];
		int a = fis.read(b);
		System.out.println(a);
		for (byte c : b) {
			System.out.println(c);
		}
		System.out.println("---------------");
		int c = fis.read(b);
		System.out.println(c);
		for (byte by : b) {
			System.out.println(by);
		}
		
		
		fis.close();
	}

}

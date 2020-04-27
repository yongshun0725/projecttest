package edu.zzu.project20;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo6_Buffer {

	public static void main(String[] args) throws IOException {
		//demo1();
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\新建文件夹\\Java基础班笔记\\1.png"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\新建文件夹\\Java基础班笔记\\2.png"));
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b);
		}
		//bos.flush();  //flush用处，实时刷新
		bis.close();
		bos.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("E:\\新建文件夹\\Java基础班笔记\\1.png");
		FileOutputStream fos = new FileOutputStream("E:\\新建文件夹\\Java基础班笔记\\2.jpg");
        BufferedInputStream bist = new BufferedInputStream(fis);
        BufferedOutputStream bfos = new BufferedOutputStream(fos);
        
        int b;
        while((b = bist.read()) != -1) {
        	bfos.write(b);
        }
        bist.close();
        bfos.close();
	}

}

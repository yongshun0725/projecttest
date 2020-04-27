package edu.zzu.project20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo5_Copy {
	// 文件复制
	public static void main(String[] args) throws IOException {
		// demo1();
		//demo2();
		FileInputStream fis = new FileInputStream("E:\\新建文件夹\\Java基础班笔记\\1.png");
		FileOutputStream fos = new FileOutputStream("E:\\新建文件夹\\Java基础班笔记\\2.jpg");
		byte[] b = new byte[1024];
		int len;
		while((len = fis.read(b)) != -1) {
			fos.write(b,0,len);
		}
		
		fis.close();
		fos.close();
	}

	private static void demo2() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("E:\\新建文件夹\\Java基础班笔记\\1.png");
		FileOutputStream fos = new FileOutputStream("E:\\新建文件夹\\Java基础班笔记\\2.jpg");
        byte[] by = new byte[fis.available()];
        fis.read(by);
        fos.write(by);
        fis.close();
        fos.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("E:\\新建文件夹\\Java基础班笔记\\1.png");
		FileOutputStream fos = new FileOutputStream("E:\\新建文件夹\\Java基础班笔记\\2.jpg");

		int b = 0;
		while ((b = fis.read()) != -1) {
			fos.write(b);
		}
		fis.close();
		fos.close();
	}

}

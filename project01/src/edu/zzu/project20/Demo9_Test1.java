package edu.zzu.project20;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo9_Test1 {

	/**
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 */

	public static void main(String[] args) throws IOException {
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\�½��ļ���\\Java������ʼ�\\2.png"));
				BufferedOutputStream bos = new BufferedOutputStream(
						new FileOutputStream("E:\\�½��ļ���\\Java������ʼ�\\3.png"));) {
			int b;
			while ((b = bis.read()) != -1) {
				bos.write(b ^ 123);
			}
		}
	}

}

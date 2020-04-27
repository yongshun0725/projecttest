package edu.zzu.project20;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Demo9_Copy {

	/**
	 * 
	 * @param args
	 * 
	 *             在控制台输入文件的路径，将文件拷贝到当前路径下
	 * 
	 *             分析： 1.创建键盘录入对象 2.判断录入对对象是否是是文件，是就返回 3.在主方法中接收该对象 4.拷贝到当前路径
	 * @throws IOException
	 */

	public static void main(String[] args) throws IOException {
		System.out.println("请输入：");
		File file = getFile();
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file.getName()));) {
			int b;
			while ((b = bis.read()) != -1) {
				bos.write(b);
			}
		}
	}

	/*
	 * 定义一个方法获取键盘录入对象，并封装为File对象 1.返回值类型File 2.参数列表无
	 */
	public static File getFile() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String line = sc.nextLine();
			File file = new File(line);
			if (!file.exists()) {
				System.out.println("您录入的文件路径不存在，请重新录入");
				sc = new Scanner(System.in);
			} else if (file.isDirectory()) {
				System.out.println("您录入的是文件夹路径，请重新录入");
				sc = new Scanner(System.in);
			} else {
				sc.close();
				return file;
			}
		}

	}
}

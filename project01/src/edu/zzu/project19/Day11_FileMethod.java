package edu.zzu.project19;

import java.io.File;
import java.io.IOException;

public class Day11_FileMethod {

	public static void main(String[] args) throws IOException{
         demo1();
		//demo2();
		File dir1 = new File("ccc\\ddd");
		System.out.println(dir1.mkdirs());
	}
	//创建文件夹
	private static void demo2() {
		File dir1 = new File("aaa");
		System.out.println(dir1.mkdir());
	}
    //创建文件
	private static void demo1() throws IOException {
		File file = new File("yyy.txt");
         System.out.println(file.createNewFile());
	}

}

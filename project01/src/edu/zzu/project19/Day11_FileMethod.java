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
	//�����ļ���
	private static void demo2() {
		File dir1 = new File("aaa");
		System.out.println(dir1.mkdir());
	}
    //�����ļ�
	private static void demo1() throws IOException {
		File file = new File("yyy.txt");
         System.out.println(file.createNewFile());
	}

}

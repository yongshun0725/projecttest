package edu.zzu.project19;

import java.io.File;
import java.io.IOException;

public class Demo13_FileMethod {

	public static void main(String[] args) throws IOException {

		File file = new File("yyy.txt");
		File file2 = new File("aaa");
		file.createNewFile();
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
	}

}

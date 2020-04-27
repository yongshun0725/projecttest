package edu.zzu.project19;

import java.io.File;

public class Demo15_File {

	public static void main(String[] args) {
		File file = new File("./");
//		String[] arr = file.list();
//		for (String string : arr) {
//            if(string.endsWith(".txt")) {
//            	System.out.println(string);
//            }
//		}
		File[] subFiles = file.listFiles();
		for (File file2 : subFiles) {
			if(file2.isFile() && file2.getName().endsWith(".txt")) {
				System.out.println(file2.getName());
			}
		}
	}

}

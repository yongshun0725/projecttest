package edu.zzu.project19;

import java.io.File;
import java.io.FilenameFilter;

public class Demo16_File {

	public static void main(String[] args) {
		File file = new File("D://");
        String[] arr = file.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				
				File file = new File(dir, name);
				return file.isFile() && file.getName().endsWith(".txt");
			}
		});
        for (String string : arr) {
			System.out.println(string);
		}
	}

}

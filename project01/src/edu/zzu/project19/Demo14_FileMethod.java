package edu.zzu.project19;

import java.io.File;
import java.util.Date;

public class Demo14_FileMethod {

	public static void main(String[] args) {
        File file = new File("yyy.txt");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(new Date(file.lastModified()));
	}

}

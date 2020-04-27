package edu.zzu.project21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo3_Copy {

	public static void main(String[] args) throws IOException {
		//demo1();
		FileReader fr = new FileReader("xxx.txt");
		FileWriter fw = new FileWriter("yyy.txt");
		char[] c = new char[1024];
		int len;
		while((len = fr.read(c)) != -1) {
			fw.write(c,0,len);
		}
		fr.close();
		fw.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileReader fw = new FileReader("xxx.txt");
		FileWriter fw2 = new FileWriter("yyy.txt",true);
		int c;
		while((c = fw.read()) != -1) {
			fw2.write(c);
		}
		fw.close();
		fw2.close();
	}

}


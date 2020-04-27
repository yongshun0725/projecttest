package edu.zzu.project22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Demo1_SequenceInputStream {

	public static void main(String[] args) throws IOException{
         //demo1();
		//demo2();
		FileInputStream fis1 = new FileInputStream("a.txt");
		FileInputStream fis2 = new FileInputStream("b.txt");
		FileInputStream fis3 = new FileInputStream("c.txt");
		
		Vector<FileInputStream> v = new Vector<FileInputStream>();
		v.add(fis1);
		v.add(fis2);
		v.add(fis3);
		
		Enumeration<FileInputStream> en = v.elements();
		SequenceInputStream sis = new SequenceInputStream(en);
		FileOutputStream fos = new FileOutputStream("d.txt");
		
		int b;
		while((b = sis.read()) != -1) {
			fos.write(b);
		}
		sis.close();
		fos.close();
	}

	private static void demo2() throws FileNotFoundException, IOException {
		FileInputStream fis1 = new FileInputStream("a.txt");
		FileInputStream fis2 = new FileInputStream("b.txt");
		SequenceInputStream sis = new SequenceInputStream(fis1,fis2);
		FileOutputStream fos = new FileOutputStream("c.txt");
		
		int b;
		while((b = sis.read()) != -1) {
			fos.write(b);
		}
		fos.close();
		sis.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("a.txt");
        FileOutputStream fos = new FileOutputStream("c.txt");
         
         int b;
         while((b = fis.read()) != -1) {
        	 fos.write(b);
         }
         fis.close();
         fos.flush();
         FileInputStream fis2 = new FileInputStream("b.txt");
         int b2;
         while((b2 = fis2.read()) != -1) {
        	 fos.write(b2);
         }
         fis2.close();
         fos.close();
	}

}


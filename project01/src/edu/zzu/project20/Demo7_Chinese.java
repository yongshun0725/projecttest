package edu.zzu.project20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo7_Chinese {
  
	/**   
	 * @param args
	 * @throws IOException    
	 */
	public static void main(String[] args) throws IOException {
         //demo();
		
		  FileOutputStream fos = new FileOutputStream("yyy.txt");
		  fos.write("我读书少，你不骗我".getBytes()); fos.close();
		 
	}

private static void demo() throws FileNotFoundException, IOException {
	FileInputStream fis = new FileInputStream("yyy.txt");
	 byte[] b = new byte[3];
	 int len;
	 while((len = fis.read(b)) != -1) {
		 System.out.println(new String(b , 0 , len));
	 }
}

}


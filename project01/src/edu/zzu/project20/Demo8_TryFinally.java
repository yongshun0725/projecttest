package edu.zzu.project20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo8_TryFinally {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		//jdk1.7以后写法，因为二者具备自动关闭功能
		try(FileInputStream fis = new FileInputStream("yyy.txt");
		FileOutputStream fos = new FileOutputStream("xxx.txt");){
			int b;
			while((b = fis.read()) != -1) {
				fos.write(b);
			}
		}
		
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			int b;
			fis = new FileInputStream("yyy.txt");
			fos = new FileOutputStream("xxx.txt");
			while ((b = fis.read()) != -1) {
				fos.write(b);
			}
		} finally {
			try {
				if (fis != null)
					fis.close();

			} finally {
				if (fos != null)
					fos.close();
			}

		}
	}

}

package edu.zzu.project22;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Demo4_RandomAccessFile {

	public static void main(String[] args) throws IOException{
          RandomAccessFile raf = new RandomAccessFile("d.txt", "rw");
          int x = raf.read();
          //System.out.println(x);
          raf.seek(10);
          raf.write('a');
          raf.close();
	}

}


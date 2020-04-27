package edu.zzu.project21;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Demo7_LineNumberReader {

	public static void main(String[] args) throws IOException{
          LineNumberReader lmr = new LineNumberReader(new FileReader("xxx.txt"));
          String line;
          while((line = lmr.readLine()) != null) {
        	  System.out.println(lmr.getLineNumber()+" "+line);
          }
          lmr.close();
	}

}


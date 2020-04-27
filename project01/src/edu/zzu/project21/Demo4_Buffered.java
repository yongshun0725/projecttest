package edu.zzu.project21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo4_Buffered {

	public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
      BufferedWriter bw = new BufferedWriter(new FileWriter("yyy.txt"));
      int c;
      while((c = br.read()) != -1) {
    	  bw.write(c);
      }
      br.close();
      bw.close();
	}

}


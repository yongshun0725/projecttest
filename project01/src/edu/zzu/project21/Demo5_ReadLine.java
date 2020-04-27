package edu.zzu.project21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo5_ReadLine {
    /*
     * newLine和\r\n的区别
     * newLine是跨平台的
     * */
	
	public static void main(String[] args) throws IOException {
        //demo1();
		BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("yyy.txt"));
		String line;
		while((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
		}
		br.close();
		bw.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
        String str;
        while((str = br.readLine()) != null) {
        	System.out.println(str);
        }
	}

}


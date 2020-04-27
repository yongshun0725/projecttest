package edu.zzu.project21;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo9_Test {
    /**
     * @param args
     * @throws IOException 
     * 
     * 
     */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("config.txt"));
		String line = br.readLine();
		br.close();
		FileWriter fw = new FileWriter("config.txt");
		int num = Integer.parseInt(line);
		if(num > 0) {
			fw.write((num - 1)+"");
			fw.close();
		}else {
			System.out.println("Çë¹ºÂòÕý°æ£¡£¡£¡£¡");
		}
		
	}

}


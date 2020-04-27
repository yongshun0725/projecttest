package edu.zzu.project21;

import java.io.FileWriter;
import java.io.IOException;

public class Demo2_FileWriter {

	public static void main(String[] args) throws IOException{
       FileWriter fw = new FileWriter("xxx.txt",true);
       fw.write("ƒ„ «À≠∞Æ·Ã·Ã");
       fw.close();
	}

}


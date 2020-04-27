package edu.zzu.project20;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo4_FileOutPutStream {
    //×·¼Ó¹¦ÄÜ
	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("yyy.txt",true);
		fos.write(97);
	}

}

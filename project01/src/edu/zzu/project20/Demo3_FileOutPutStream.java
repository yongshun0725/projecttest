package edu.zzu.project20;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3_FileOutPutStream {

	public static void main(String[] args) throws IOException {
       FileOutputStream fos = new FileOutputStream("yyy.txt");   //创建字节输出流，如果不存在，自动创建
       fos.write(97);    // 虽然写出的是数字，但在文件会自动去除前3个字节
       fos.write(98);
	}

}

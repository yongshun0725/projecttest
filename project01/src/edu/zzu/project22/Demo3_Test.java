package edu.zzu.project22;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo3_Test {
	/**
	 * 
	 * @param args
	 *
	 *             定义一个输入流，调用read（byte[]）方法，将a.txt文件中的内容打印出来，byte数组大小为5
	 * 
	 *             分析：
	 *             1.read(byte[])是字节输入流方法，创建fileinputstream，关联a.txt
	 *             2.创建字节数组，大小为5 
	 *             3.创建内存输入流，将读到的数据写到内存输出流中 
	 *             4.将内存输出流的数据全部转化为字符打印
	 *             5.关闭输入流
	 * 
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// 1. read(byte[])是字节输入流方法，创建fileinputstream，关联a.txt
		FileInputStream fis = new FileInputStream("a.txt");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] b = new byte[5];
        int len;
        while((len = fis.read(b)) != -1) {
        	baos.write(b,0,len);
        }
        System.out.println(baos);
        fis.close();
        baos.close();
	}

}

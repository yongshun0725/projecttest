package edu.zzu.project22;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo2_Seq {
    /**
     * @param args
     * 
     * ByteArrayInputStream
     * 内存输出流
     * 
     * FileInputStream读取中文乱码
     * 
     * 解决方案
     * 1.使用字符输出流
     * 2.ByteArrayInputStream
     */
	public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream("a.txt");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        
        int b;
        while((b = fis.read()) != -1) {
        	baos.write(b);
        }
        //byte[] arr = baos.toByteArray();
        System.out.println(baos.toString());
        fis.close();
	}

}


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
	 *             ����һ��������������read��byte[]����������a.txt�ļ��е����ݴ�ӡ������byte�����СΪ5
	 * 
	 *             ������
	 *             1.read(byte[])���ֽ�����������������fileinputstream������a.txt
	 *             2.�����ֽ����飬��СΪ5 
	 *             3.�����ڴ���������������������д���ڴ�������� 
	 *             4.���ڴ������������ȫ��ת��Ϊ�ַ���ӡ
	 *             5.�ر�������
	 * 
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// 1. read(byte[])���ֽ�����������������fileinputstream������a.txt
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

package edu.zzu.project23;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3_Test {
	/**
	 * 
	 * @param args   
	 *
	 * �ļ�����
	 * 
	 * ������
	 * 1.��Ŀ���ļ��д���ԭ�ļ���
	 * 2.��ȡԭ�ļ����������ļ����ļ��У��洢��File������
	 * 3.��������
	 * 4.������ļ�ʹ��io����д
	 * 5.�ļ��еݹ����
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
        File file1 = Demo1_Test.getFile();
        File file2 = Demo1_Test.getFile();
        if(!file1.equals(file2)) {
        	
        }
        copy(file1,file2);
	}
    /**
     * ����
     * 1.����ֵ����void
     * 2.�����б�File src File dest
     * @throws IOException 
     */
	public static void copy(File src, File dest) throws IOException {
		File newDir = new File(dest,src.getName());
		newDir.mkdir();
		File[] subFiles = src.listFiles();
		for (File file : subFiles) {
			if(file.isFile()) {
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
				BufferedOutputStream bos = 
						new BufferedOutputStream(new FileOutputStream(new File(newDir,file.getName())));
				int b;
				while((b = bis.read()) != -1) {
					bos.write(b);
				}
				bis.close();
				bos.close();
			}else {
				copy(file, newDir);
			}
		}
	}
}


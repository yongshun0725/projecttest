package edu.zzu.project23;

import java.io.File;

public class Demo2_Test {
    /**
     * 
     * @param args   
     *
     *���󣺴Ӽ��̽���һ���ļѼѣ�ɾ�����ļ���
     *
     *������
     *  1.��ȡ���ļ����������ļ����ļ���
     *  
     */
	public static void main(String[] args) {
          delFile(Demo1_Test.getFile());
	}
    /**
     * ɾ�����ļ���
     * 1.����ֵΪvoid
     * 2.�����б�File
     */
	public static void delFile(File dir) {
		File[] subFiles = dir.listFiles();
		for (File file : subFiles) {
			if(file.isFile()) {
				file.delete();
			}else {
				delFile(file);
			}
		}
		dir.delete();
	}
}


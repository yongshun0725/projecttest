package edu.zzu.project23;

import java.io.File;

public class Demo4_Test {
    /**
     * 
     * @param args   
     *
     *������
     *   1.��ȡ�����ļ����ļ���
     *   2.��������
     *   3.�������ļ������ļ��ж���Ҫ��ӡ
     *   4.������ļ��еݹ�
     */
	
	public static void main(String[] args) {
        File dir = Demo1_Test.getFile();
        printLev(dir,0);
        
	}

	private static void printLev(File dir,int num) {
		File[] subFiles = dir.listFiles(); 
		
		for (File file : subFiles) {
			for(int i = 0; i < num; i++) {
				System.out.print("\t");
			}
			System.out.println(file.getName());
			if(file.isDirectory()) {
				printLev(file,num+1);
			}
		}
	}

}


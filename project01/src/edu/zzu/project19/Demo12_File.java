package edu.zzu.project19;

import java.io.File;

public class Demo12_File {
    /*
     * A����������ɾ��
     *    renameTo(File file):���ļ���������ָ��·��
     *    delete():ɾ���ļ����ļ���
     * */
	public static void main(String[] args) {
           //demo1();
		   //demo2();
		File file3 = new File("aaa");
		System.out.println(file3.delete());
	}
   //ɾ���ļ�
	private static void demo2() {
		File file = new File("ooo.txt");
		System.out.println(file.delete());
	}
   //�������ļ�
	private static void demo1() {
		File file = new File("yyy.txt");
           File refile = new File("ooo.txt");
           System.out.println(file.renameTo(refile));
	}

}

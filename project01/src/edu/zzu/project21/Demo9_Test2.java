package edu.zzu.project21;

import java.io.File;
import java.util.Scanner;

public class Demo9_Test2 {
  
	/**
     * @param args
     * 
     * �Ӽ��̽���һ���ļ���·������ӡ������.java�ļ�
     * 
     * ����
     * 1.���¼��Ĳ����ڣ�������ʾ
     * 2.��¼������ļ���������ʾ
     * 3.���¼������ļ��У����뷵��
     * 
     * ��ӡ�����ļ���������.java�ļ�
     * 1.��ȡ��·���������ļ����ļ��У��洢��File������
     * 2.�������飬��ÿ���ļ����ļ��������ж�
     * 3.������ļ��Һ�׺��.java����ӡ
     * 4.������ļ��У��ݹ�
     */
	public static void main(String[] args) {
         printJavaFile(getFile());
	}
   /**
    * ��ȡ¼����ļ���·��
    * 1.����ֵFile
    * 2.�޲���
    */
	public static File getFile() {
		System.out.println("������һ���ļ���·����");
		Scanner sc = new Scanner(System.in);
		while(true) {
			String line = sc.nextLine();
			File dir = new File(line);
			if(!dir.exists()) {
				System.out.println("����·�������ڣ����������룡");
			}else if(dir.isFile()) {
				System.out.println("��¼������ļ���������¼���ļ���·����");
			}else {
				return dir;
			}
		}
	}
	
	/*
	 * ��ȡ�ļ���������·��
	 * 1.����ֵvoid
	 * 2.�����б�File file
	 */
	
	public static void printJavaFile(File file) {
		File[] list = file.listFiles();
		for (File file2 : list) {
			if(file2.isFile() && file2.getName().endsWith(".java")) {
				System.out.println(file2.getName());
			}else if(file.isDirectory()){
				printJavaFile(file2);
			}
		}
	}
}


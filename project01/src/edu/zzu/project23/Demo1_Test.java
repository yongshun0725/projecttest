package edu.zzu.project23;

import java.io.File;
import java.util.Scanner;

public class Demo1_Test {
    /**
     * @param args   
     *
     * �Ӽ��� ����һ��·�����ж��ļ��д�С
     * 
     * ������
     * ����1.�Ӽ��̽���һ���ļ�·��
     *   1.��������¼�����
     *   2.����һ������ѭ��
     *   3.������¼�������沢��װΪFile����
     *   4.��File�����ж�
     *   5.���ļ���·������
     * 
     * ����2��ͳ���ļ��д�С
     *    1.����һ����ͱ���
     *    2.��ȡ���ļ���������listFiles()
     *    3.��������
     *    4.�ж����ļ����ۼ�
     *    5.�ж��ǻ��ļ��о͵ݹ�
     */
	public static void main(String[] args) {
          System.out.println(getSize(getFile()));
	}

	/**
	 * �Ӽ��̽���һ���ļ���·��
	 * 1.����ֵFile
	 * 2.�����б���
	 */
	public static File getFile() {
		//1.��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��·����");
		//2.����һ������ѭ��
        while(true) {
        	//������¼�������沢��װΪFile����
        	String line = sc.nextLine();
        	File file = new File(line);
        	//��File�����ж�
        	if(!file.exists()) {
        		System.out.println("�������·�������ڣ�");
        	}else if(file.isFile()){
        		System.out.println("����������ļ�·����");
        	}else {
        		return file;
        	}
        }
	}
	
	/**
	 * ͳ���ļ��д�С
	 * 1.����ֵlong
	 * 2.�����б�File 
	 */
	public static long getSize(File file) {
		//1.����һ����ͱ���
		long len = 0;
		
        //2.��ȡ���ļ���������listFiles()
		File[] subFiles = file.listFiles();
		//3.��������
		for (File subFile : subFiles) {
			//4.�ж��ļ��ۼ�
			if(subFile.isFile()) {
				len = len + subFile.length();
			}else {
				len = len + getSize(subFile);
			}
		}
		return len;
	}
}


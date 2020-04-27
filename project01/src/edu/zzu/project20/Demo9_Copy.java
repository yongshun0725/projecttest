package edu.zzu.project20;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Demo9_Copy {

	/**
	 * 
	 * @param args
	 * 
	 *             �ڿ���̨�����ļ���·�������ļ���������ǰ·����
	 * 
	 *             ������ 1.��������¼����� 2.�ж�¼��Զ����Ƿ������ļ����Ǿͷ��� 3.���������н��ոö��� 4.��������ǰ·��
	 * @throws IOException
	 */

	public static void main(String[] args) throws IOException {
		System.out.println("�����룺");
		File file = getFile();
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file.getName()));) {
			int b;
			while ((b = bis.read()) != -1) {
				bos.write(b);
			}
		}
	}

	/*
	 * ����һ��������ȡ����¼����󣬲���װΪFile���� 1.����ֵ����File 2.�����б���
	 */
	public static File getFile() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String line = sc.nextLine();
			File file = new File(line);
			if (!file.exists()) {
				System.out.println("��¼����ļ�·�������ڣ�������¼��");
				sc = new Scanner(System.in);
			} else if (file.isDirectory()) {
				System.out.println("��¼������ļ���·����������¼��");
				sc = new Scanner(System.in);
			} else {
				sc.close();
				return file;
			}
		}

	}
}

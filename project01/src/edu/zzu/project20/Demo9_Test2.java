package edu.zzu.project20;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Demo9_Test2 {
	
	/**
	 * 
	 * �Ӽ���¼�����ݿ�������ǰĿ¼�µ�xxx.txt�ļ��У�������¼������Ϊquit���˳�
	 * 
	 * ������
	 * 1.��������¼�����
	 * 2.������������󣬹���xxx.txt�ļ�
	 * 3.��������ѭ��
	 * 4.����quit��ֹͣ
	 * 5.�������quit�ʹ���
	 * 6.�ر���
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		FileOutputStream fos = new FileOutputStream("xxx.txt");
		fos.write("12121".getBytes());
		fos.write("12121".getBytes());
		fos.write("12121".getBytes());
		fos.write("12121".getBytes());
		fos.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		System.out.println("���������ݣ�");
      //1.����¼�����
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("xxx.txt");
		
		while(true) {
			String str = sc.nextLine();
			if("quit".equals(str)) {
				break;
			}
			fos.write(str.getBytes());
			fos.write("\r\n".getBytes());
		}
		sc.close();
		fos.close();
	}
}

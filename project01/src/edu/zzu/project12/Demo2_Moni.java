package edu.zzu.project12;

import java.util.Scanner;

/**
 * 
 * @ClassName: Demo2_Moni
 * @Description: A:������ʾ ����ģ���½�����λ��ᣬ����ʾ���м��λ��� �û�������admin ������ 1.ģ���½����Ҫ��������
 *               2.���λ��ᣬ��Ҫѭ�� 3.��ʾ���м��λ��ᣬ��Ҫ�ж�
 * @author sys
 * @date 2020-02-13 03:13:26
 */
public class Demo2_Moni {

	public static void main(String[] args) {
		int num = 3; // ���λ���

		Scanner sc = new Scanner(System.in);
		while (true) {
			if (num > 0) {
				System.out.println("�������û�����");
				String name = sc.nextLine(); // ��ȡ������˺�
				System.out.println("���������룺");
				String pass = sc.nextLine(); // ��ȡ������˺�
				if (name.equals("admin") && pass.equals("admin")) {
					System.out.println("��½�ɹ�����");
					break;
				} else {
					num--;
					System.out.println("��¼ʧ�ܣ�������" + num + "�λ���");
					if (num == 0) {
						System.out.println("���ĵ�½�����Ѿ����꣡��");
					}
				}
			}
		}

	}

}

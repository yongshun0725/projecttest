package edu.zzu.project17;

import java.util.HashSet;
import java.util.Scanner;

public class Demo4_Test {
private static Scanner scanner;

	/*
 * ������
 * 1.����Scanner����
 * 2.����HasSet���󣬴洢�ַ���ȥ�ظ�
 * 3.���ַ���ת��Ϊ�ַ�����
 * */
	public static void main(String[] args) {
       //1.����Scanner����
		System.out.println("������һ�� ");
		scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		//2.����HasSet����
		HashSet<Character> hs = new HashSet<Character>();
		//J���ַ���ת��Ϊ�ַ�����
		char[] ch = str.toCharArray();
		for (char c : ch) {
			hs.add(c);
		}
		for (char c : ch) {
			System.out.print(c+"  ");
		}
	}

}

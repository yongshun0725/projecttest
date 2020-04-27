package edu.zzu.project17;

import java.util.HashSet;
import java.util.Scanner;

public class Demo4_Test {
private static Scanner scanner;

	/*
 * 分析：
 * 1.创建Scanner对象
 * 2.创建HasSet对象，存储字符，去重复
 * 3.将字符串转化为字符数字
 * */
	public static void main(String[] args) {
       //1.创建Scanner对象
		System.out.println("请输入一行 ");
		scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		//2.创建HasSet对象
		HashSet<Character> hs = new HashSet<Character>();
		//J将字符串转化为字符数组
		char[] ch = str.toCharArray();
		for (char c : ch) {
			hs.add(c);
		}
		for (char c : ch) {
			System.out.print(c+"  ");
		}
	}

}

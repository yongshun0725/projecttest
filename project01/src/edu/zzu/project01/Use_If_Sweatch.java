package edu.zzu.project01;

import java.util.Scanner;

public class Use_If_Sweatch {

	public static void main(String[] args) {
		int test [] = new int [] {2,2,3,4,5};
	   Scanner sc = new Scanner(System.in);
	   int a = sc.nextInt();
	   int b = sc.nextInt();
	   System.out.println(getMax(a, b));
	}
	public static int getMax(int a ,int b) {
		
		return a > b ? a : b;
	}

}

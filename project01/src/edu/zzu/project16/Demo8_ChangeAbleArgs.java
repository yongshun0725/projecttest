package edu.zzu.project16;

public class Demo8_ChangeAbleArgs {

	public static void main(String[] args) {
         test(11,22,11);
	} 

	public static void test(int ... arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

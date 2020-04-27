package edu.zzu.project13;

import java.util.Arrays;

public class Demo8_Array {

	public static void main(String[] args) {
		String s = "25 11 -6 20 102 9";
		String[] str = s.split(" ");
		
		int[] i = new int[str.length];
		for(int a = 0; a < str.length; a++) {
			i[a] = Integer.parseInt(str[a]);
		}
		Arrays.sort(i);
		System.out.println(Arrays.toString(i));
	}
	

}

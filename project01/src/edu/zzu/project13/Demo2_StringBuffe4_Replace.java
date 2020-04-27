package edu.zzu.project13;

public class Demo2_StringBuffe4_Replace {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("heima");
		sb1.replace(0,3, "bai");
		System.out.println(sb1);
		System.out.println(sb1.reverse());
	}

}

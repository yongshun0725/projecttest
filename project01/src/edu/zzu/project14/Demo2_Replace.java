package edu.zzu.project14;

public class Demo2_Replace {
/*
 * 正则表达式的替换功能
 */
	public static void main(String[] args) {
      String s = "wo1ai23ehi1maa";
      String reg = "\\d";
      System.out.println(s.replaceAll(reg, "0"));
	}

}

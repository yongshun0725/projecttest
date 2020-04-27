package edu.zzu.project14;

import java.util.Arrays;

public class Demo3_Regex {

	public static void main(String[] args) {
		//demo1();
		demo2();
		//demo3();
		String s = "我我....我.....我.要..要..学..学..学..编程";
		String s2 = s.replaceAll("\\.+", "");
		
		//System.out.println(s2);
	}

	private static void demo3() {
		String s = "我我....我.....我.要..要..学..学..学..编程";
		String s2 = s.replaceAll("\\.+", "");
		String s3 = s2.replaceAll("(.)\\1+", "$1");
		System.out.println(s3);
	}

	private static void demo2() {
		String s = "sddqeertttdx";
		String regex = "(.)\\1+";
		String ss[] = s.split(regex);
	    System.out.println(Arrays.toString(ss));
	}

	private static void demo1() {
		String regex = "(.)\\1(.)\\2";
        String s = "快快乐乐的";
        System.out.println(s.matches(regex));
        String regex2 = "(..)\\1";
        String s2 = "高兴高兴";
        System.out.println(s2.matches(regex2));
	}

}

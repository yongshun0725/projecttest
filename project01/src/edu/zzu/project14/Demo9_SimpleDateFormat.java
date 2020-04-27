package edu.zzu.project14;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo9_SimpleDateFormat {

	public static void main(String[] args) throws ParseException {
		//demo1();
		deno2();
	}
	private static void deno2() throws ParseException {
		String str = "2000��08��08�� 08:08:08";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		Date d = sdf.parse(str);
		System.out.println(d);
	}
//���ʱ�䣺
	private static void demo1() {
		Date d1 = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		System.out.println(sd.format(d1));
	}

}

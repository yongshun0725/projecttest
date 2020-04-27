package edu.zzu.project14;

import java.util.Date;

public class Demo8_Date {

	public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        Date d2 = new Date(0);
        System.out.println(d2);
        date.setTime(1000);
        System.out.println(date);
        System.out.println(System.currentTimeMillis());
	}

}

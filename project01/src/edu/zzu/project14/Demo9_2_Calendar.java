package edu.zzu.project14;

import java.util.Calendar;
import java.util.Scanner;

public class Demo9_2_Calendar {

	public static void main(String[] args) {
    // demo1();
		//String[] arr = {"","������","����һ","���ڶ�","������","������","������","������"}; 
      Scanner sc = new Scanner(System.in);
      System.out.println("��������ݣ�");
      String line = sc.nextLine();
      int year = Integer.parseInt(line);
      boolean b = getYear(year);
      System.out.println(b);
	}

	private static void demo1() {
		Calendar c = Calendar.getInstance();
		 System.out.println(c.get(Calendar.YEAR));
		 System.out.println(c.get(Calendar.DAY_OF_MONTH));
	}
     public static boolean getYear(int year) {
    	 
    	 Calendar c = Calendar.getInstance();
    	 c.set(year, 2,1);
    	 c.add(Calendar.DAY_OF_MONTH, -1);
    	 return c.get(Calendar.DAY_OF_MONTH) == 29;
     }
}

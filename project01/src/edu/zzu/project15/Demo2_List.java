package edu.zzu.project15;

import java.util.ArrayList;
import java.util.Collection;

import edu.zzu.project15.bean.Student;

public class Demo2_List {

	public static void main(String[] args) {
     demo1();
     
     
	}

	private static void demo1() {
		Collection c = new ArrayList();
		 boolean b1 = c.add("abc");
		 boolean b2 = c.add(true);
		 c.add(new Student("уехЩ",20));
		 System.out.println(c.size());
	}

}

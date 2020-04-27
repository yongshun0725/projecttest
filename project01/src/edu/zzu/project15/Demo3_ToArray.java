package edu.zzu.project15;

import java.util.ArrayList;
import java.util.Collection;

import edu.zzu.project15.bean.Student;

public class Demo3_ToArray {

	public static void main(String[] args) {
		// demo1();
		//demo2();

	}

	private static void demo2() {
		Collection c = new ArrayList();
		c.add(new Student("张三", 20));
		c.add(new Student("李四", 20));
		c.add(new Student("王五", 20));
		Object[] o = c.toArray();
		for (int i = 0; i < o.length; i++) {
			Student s = (Student) o[i];
			System.out.println(s.getName());
		}
	}

	private static void demo1() {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		Object[] o = c.toArray();
		for (int i = 0; i < o.length; i++) {
			System.out.println(o[i]);
		}
	}

}

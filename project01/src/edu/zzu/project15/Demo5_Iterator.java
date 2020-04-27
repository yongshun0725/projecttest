package edu.zzu.project15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import edu.zzu.project15.bean.Student;

public class Demo5_Iterator {

	public static void main(String[] args) {
		//demo1();
		Collection c = new ArrayList();
		c.add(new Student("张三", 20));
		c.add(new Student("李四", 20));
		c.add(new Student("王五", 20));
		
		Iterator  i = c.iterator();
		while(i.hasNext()) {
			Student s = (Student)i.next();
			System.out.println(s.getName()+"    "+s.getAge());
		}
 	}

	private static void demo1() {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		Iterator i = c.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}

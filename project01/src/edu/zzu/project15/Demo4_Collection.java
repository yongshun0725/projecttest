package edu.zzu.project15;

import java.util.ArrayList;
import java.util.Collection;

public class Demo4_Collection {

	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("c");
		//c2.add("d");
		
		System.out.println(c.retainAll(c2));
		//取交集，如果改变返回true，否则false
	}

	private static void demo3() {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("c");
		c2.add("f");
		
		System.out.println(c.containsAll(c2));
	}

	private static void demo2() {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c.removeAll(c2);
		System.out.println(c);
	}

	private static void demo1() {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("c");
		c2.add("d");
		c.addAll(c2);
		System.out.println(c);
	}

}

package edu.zzu.project15;

import java.util.ArrayList;
import java.util.List;

public class Demo6_List {
	/**
	 * 
	 * @Title: main
	 * @Description: TODO(ÃèÊö)
	 * @param args
	 * @author sys
	 * @date 2020-02-17 01:09:34
	 */
	public static void main(String[] args) {
		// demo1();
		//demo2();
		//demo3();
		
	}

	private static void demo3() {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("0");
		System.out.println(list.get(0));
	}

	private static void demo2() {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("0");
		list.remove(1);
		System.out.println(list);
	}

	private static void demo1() {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("0");
		list.add(1, 4); // Ë÷Òı±ØĞëÊÇ0 ¡ª (size-1)
		System.out.println(list);
	}

}

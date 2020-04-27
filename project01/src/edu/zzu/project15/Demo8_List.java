package edu.zzu.project15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Demo8_List {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("0");
		ListIterator i = list.listIterator();
		while(i.hasNext()) {
			String str = (String) i.next();
			if(str.equals("a")) {
				i.add("0000");
			}
		}
		System.out.println(list);
	}

}

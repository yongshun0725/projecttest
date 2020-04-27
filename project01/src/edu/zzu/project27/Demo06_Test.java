package edu.zzu.project27;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Demo06_Test {

	public static void main(String[] args) throws Exception{

		ArrayList<Integer> list = new ArrayList<Integer>();
		Class clazz = Class.forName("java.util.ArrayList");
		list.add(111);
		Method m = clazz.getMethod("add", Object.class);
		m.invoke(list, "abc");
		System.out.println(list);
	}

}


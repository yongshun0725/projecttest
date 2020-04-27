package edu.zzu.project17;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Demo5_Test {
/*
 * 需求：将集合中重复元素去去掉
 * 
 * 分析：
 * 1.创建List集合存储若干元素
 * 2.定义去除方法
 * 3.打印List集合
 * */
	
	public static void main(String[] args) {
         ArrayList<String> list = new ArrayList<String>();
         list.add("a");
         list.add("a");
         list.add("a");
         list.add("b");
         list.add("b");
         list.add("c");
         list.add("c");
         list.add("d");
         list.add("d");
         
         getSingle(list);
         System.out.println(list);
	}

	private static void getSingle(List<String> list) {
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		hs.addAll(list);
		list.clear();
		list.addAll(hs);
	}

}

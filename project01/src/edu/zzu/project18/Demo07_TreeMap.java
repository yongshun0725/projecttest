package edu.zzu.project18;

import java.util.Comparator;
import java.util.TreeMap;

public class Demo07_TreeMap {

	public static void main(String[] args) {

		TreeMap<Student, String> tm = new TreeMap<>(new Comparator<Student>() {

			@Override 
			public int compare(Student o1, Student o2) {
				return 0;
			}
		     
		});
		tm.put(new Student("张三",23), "北京");
		tm.put(new Student("李四",24), "上海");
		tm.put(new Student("王五",26), "深圳");
		System.out.println(tm);
	}

}

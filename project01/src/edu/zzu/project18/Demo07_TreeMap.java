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
		tm.put(new Student("����",23), "����");
		tm.put(new Student("����",24), "�Ϻ�");
		tm.put(new Student("����",26), "����");
		System.out.println(tm);
	}

}

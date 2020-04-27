package edu.zzu.project17;

import java.util.TreeSet;

public class Demo7_TreeSet {

	public static void main(String[] args) {

		TreeSet<Person> tree = new TreeSet<Person>();
		tree.add(new Person("张三",20));
		tree.add(new Person("李四",21));
		tree.add(new Person("王五",22));
		tree.add(new Person("赵六",23));
		tree.add(new Person("赵六",24));
		
	}

}

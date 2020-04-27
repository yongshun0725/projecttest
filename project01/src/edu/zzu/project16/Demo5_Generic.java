package edu.zzu.project16;

import java.util.ArrayList;
import java.util.List;

public class Demo5_Generic {

	public static void main(String[] args) {
     // List<?> list = new ArrayList<String>();    //当右边泛型不确定时，左边可以用？
      ArrayList<Person> list = new ArrayList<Person>(); 
      list.add(new Person("a张三",21));
      ArrayList<Student> list1 = new ArrayList<Student>();
      list1.add(new Student("许文胜",26));
      list1.add(new Student("许文胜2",22));
      list.addAll(list1);
      System.out.println(list);
      System.out.println(list.size());
      for (int i = 0; i < list.size(); i++) {
	          System.out.println(list.get(i));
	}
	}

}

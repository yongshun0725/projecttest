package edu.zzu.project16;

import java.util.ArrayList;
import java.util.List;

public class Demo5_Generic {

	public static void main(String[] args) {
     // List<?> list = new ArrayList<String>();    //���ұ߷��Ͳ�ȷ��ʱ����߿����ã�
      ArrayList<Person> list = new ArrayList<Person>(); 
      list.add(new Person("a����",21));
      ArrayList<Student> list1 = new ArrayList<Student>();
      list1.add(new Student("����ʤ",26));
      list1.add(new Student("����ʤ2",22));
      list.addAll(list1);
      System.out.println(list);
      System.out.println(list.size());
      for (int i = 0; i < list.size(); i++) {
	          System.out.println(list.get(i));
	}
	}

}

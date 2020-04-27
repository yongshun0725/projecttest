package edu.zzu.project15;

import edu.zzu.project15.bean.Student;

public class Demo1_Collection {

	public static void main(String[] args) {
		Integer i= Integer.valueOf(0);
		int a = i.intValue();
		Student[] arr = new Student[5];
		arr[0] = new Student("张三", 20);
		arr[1] = new Student("李四", 20);
		arr[2] = new Student("王五", 20);
		arr[3] = new Student("郭德纲", 20);
		for (int sysout = 0; sysout < arr.length; sysout++) {
			System.out.println(arr[sysout]);
		}
	}

}

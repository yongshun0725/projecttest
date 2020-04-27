package edu.zzu.project27;

import java.lang.reflect.Field;

public class Demo07_Test {

	public static void main(String[] args) throws Exception {

		Student s1 = new Student("张三", 23);
		Tool t = new Tool();
		t.setProperity(s1, "name", "李四");
	    System.out.println(s1);	
	}

}

class Tool{
	public void setProperity(Object obj, String name, Object value) throws Exception{
		Class clazz = obj.getClass();
		Field f = clazz.getDeclaredField(name);
		f.setAccessible(true);
		f.set(obj, value);
	}
}

class Student{
	String name;
	int age;
	public Student() {
		super();
		
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
}
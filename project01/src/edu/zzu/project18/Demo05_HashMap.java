package edu.zzu.project18;

import java.util.HashMap;

public class Demo05_HashMap {

	public static void main(String[] args) {
        HashMap<Student, String> hm = new HashMap<>();
        hm.put(new Student("张三",23), "123");
        hm.put(new Student("李四",23), "234");
        hm.put(new Student("王五",23), "1345");
        hm.put(new Student("张三",23), "1234");
        System.out.println(hm);
        
	}

}
class Student implements Comparable<Student>{
	private String name;
	private int age;
	public Student() {
		
	}
	public Student(String name, int age) {
		
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
		return "student [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public int compareTo(Student o) {
		int num = this.age - o.age;
		return num == 0 ? this.name.compareTo(o.name)  : num;
	}

	
}
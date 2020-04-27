package edu.zzu.project16;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1_RemoveSame {

	public static void main(String[] args) {
      ArrayList arr = new ArrayList();
      ArrayList list = new ArrayList();
      arr.add(new Person("张三",24));
      arr.add(new Person("张三2",24));
      arr.add(new Person("张三3",24));
      arr.add(new Person("张三4",24));
      arr.add(new Person("张三",24));
     
      Iterator it = arr.iterator();
      while(it.hasNext()) {
    	  Object obj = it.next();
    	  if(!list.contains(obj)) {
    		  list.add(obj);
    	  }
      }
      for (int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i).toString());
	}
     
	}

}
class Person{
	private String name;
	private int age;
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
	
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
		Person other = (Person) obj;
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
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
class Student extends Person{

	public Student() {
		super();
		
	}

	public Student(String name, int age) {
		super(name, age);
		
	}
	
}

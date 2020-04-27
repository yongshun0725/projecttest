package edu.zzu.project17;

import java.util.HashSet;

public class Demo2_HashSet {
	public static void main(String[] args) {
        HashSet<Person> hs = new HashSet<Person>();
        hs.add(new Person("张三",23));
        hs.add(new Person("张三",23));
        System.out.println(hs.add(new Person("张三",23)));
        System.out.println(hs);
        System.out.println(2<<5);
	}

}

class Person implements Comparable<Person>{
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
		
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
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
	public int compareTo(Person o) {
		if(this.name.hashCode() > o.name.hashCode()) {
			return 1;
		}else {
			if(this.age < o.getAge()) {
				return -1;
			}else {
				if(this.age == o.getAge()) {
					return 0;
				}else {
					return this.age > o.age ? 1: -1;
				}
			}
		}
	
	}
	
    
}
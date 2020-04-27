package edu.zzu.project19;

public class Demo06_Exception {
	public static void main(String[] args) throws Exception{
        Person p= new Person();
        p.setAge(-17);
        System.out.println(p.getAge());
	}
}
class Person {
	private String name;
	private int age;
	public Person() {
		super();
		
	}
	public Person(String name, int age) {
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
	public void setAge(int age) throws Exception  {
		if(age >= 0 && age < 150) {
			this.age = age;
		}else {
			throw new Exception("ÄêÁä·Ç·¨");
		}
	}
	
}
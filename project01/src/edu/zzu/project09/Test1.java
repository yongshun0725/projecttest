package edu.zzu.project09;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Employee{
	private String name;
	private String id;
	private int alary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAlary() {
		return alary;
	}
	public void setAlary(int alary) {
		this.alary = alary;
	}
	
	public Employee() {
		
	}
public Employee(String name,String id,int alary) {
		this.name = name;
		this.id = id;
		this.alary = alary;
	}
}
class Person extends Employee{
public Person() {
	super();
	
	}
public Person(String name,String id,int alary) {
	
	super(name,id,alary);
	
	}
}
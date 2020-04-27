package edu.zzu.project08;

public class Test3 {

	public static void main(String[] args) {
		Cat3 c = new Cat3("º”∑∆",5);
		System.out.println(c.getName());
		
	}

}
abstract class Animal3{
	private String name;
	private int age;
	public Animal3() {}
	public Animal3(String name,int age) {
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
	
	public abstract void eat();
	
}
class Cat3 extends Animal3{
	public Cat3() {}
	
	public Cat3(String name,int age) {
		super(name,age);
	}
	
	public void eat() {
		System.out.println("√®≥‘”„");
	}
	public void catchMouse() {
		System.out.println("√®◊•¿œ Û");
	}
}
class Dog3 extends Animal{
	public Dog3() {}
	public Dog3(String name,int age) {
		super(name,age);
	}
	public void eat() {
		System.out.println("π∑≥‘»‚");
	}
	public void lookHme() {
		System.out.println("π∑ø¥º“");
	}
}




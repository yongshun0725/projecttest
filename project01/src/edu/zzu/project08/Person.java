package edu.zzu.project08;

public class Person {

	public static void main(String[] args) {
		Student stu = new Student("张三",20);
		System.out.println(stu.getName()+"    "+stu.getAge());
        stu.learn();
        Teacher tea = new Teacher();
        tea.setAge(30);
        tea.setName("李四");
	}

}
/*
 *使用继承前的老式和学生案例
 *  属性：姓名，年龄
 * 行为：吃饭
 * 老师特有的方法：讲课
 * 学生特有的方法：学习   
 */
class Persons{
	private String name;
	private int age;
	public Persons() {}          //空参构造
	public Persons(String name,int age) {
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
	
	public void eat() {
		System.out.println("吃饭");
	}
	
	
}
class Teacher extends Persons{
	
	public Teacher() {}          //空参构造
	public Teacher(String name,int age) {
		super(name,age);
	}
	
	public void tech() {
		System.out.println("讲课");
	}
	
}
class Student extends Persons{
	
	public Student() {}          //空参构造
	public Student(String name,int age) {
		super(name,age);
	}
	
	public void learn() {
		System.out.println("学生"+super.getName()+"学习");
	}
	
}

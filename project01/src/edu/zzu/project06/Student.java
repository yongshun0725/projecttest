package edu.zzu.project06;

public class Student {

	
	public static void main(String[] args) {
		Student_Class stu = new Student_Class("小明",20,"男");
		System.out.println(stu.getName());
		stu.study();

	}
}
class Student_Class{
	 private String name;
     private int age;
     private String sex;
     
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Student_Class() {
    	
    }
	
	public Student_Class(String name,int age,String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
    public void study() {
    	System.out.println(this.name + "正在睡觉");
    }
}

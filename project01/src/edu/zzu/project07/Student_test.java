package edu.zzu.project07;

public class Student_test {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.setAge(10);
		stu.setName("����");
		stu.show();
		System.out.println();

	}

}
class Student{
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
	
	public Student() {
		
	}
    public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public void show() {
		System.out.println("�ҵ������ǣ�"+this.name+"   �ҵ������ǣ�"+age);
	}
}

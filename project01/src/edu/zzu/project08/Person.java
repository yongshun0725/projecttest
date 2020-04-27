package edu.zzu.project08;

public class Person {

	public static void main(String[] args) {
		Student stu = new Student("����",20);
		System.out.println(stu.getName()+"    "+stu.getAge());
        stu.learn();
        Teacher tea = new Teacher();
        tea.setAge(30);
        tea.setName("����");
	}

}
/*
 *ʹ�ü̳�ǰ����ʽ��ѧ������
 *  ���ԣ�����������
 * ��Ϊ���Է�
 * ��ʦ���еķ���������
 * ѧ�����еķ�����ѧϰ   
 */
class Persons{
	private String name;
	private int age;
	public Persons() {}          //�ղι���
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
		System.out.println("�Է�");
	}
	
	
}
class Teacher extends Persons{
	
	public Teacher() {}          //�ղι���
	public Teacher(String name,int age) {
		super(name,age);
	}
	
	public void tech() {
		System.out.println("����");
	}
	
}
class Student extends Persons{
	
	public Student() {}          //�ղι���
	public Student(String name,int age) {
		super(name,age);
	}
	
	public void learn() {
		System.out.println("ѧ��"+super.getName()+"ѧϰ");
	}
	
}

package edu.zzu.project08;

public class Test_Animals {

	public static void main(String[] args) {
		Cat cat = new Cat("��è",4);
		System.out.println(cat.getColor()+"......"+cat.getNum());
        cat.eat();
        cat.catchMouse();
	}

}
/*
 * A:è����������
 * B��������ʾ��
 *       è�������̳а�
 *       ���ԣ�ë����ɫ���ȵĸ���
 *       ��Ϊ���Է�
 *       è������Ϊ��ץ����catchMouse
 *       ��Ҳ����Ϊ������lookHome
 */

class Animal{
	private String color;
	private int num;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public Animal() {}
	public Animal(String color,int num) {
		this.color = color;
		this.num = num;
				
	}
	public void eat() {
		System.out.println("�Է�");
	}
}
class Cat extends Animal{
	public Cat() {}
	public Cat(String color,int num) {
		super(color,num);
	}
	public void eat() {
		System.out.println(getColor()+"����");
	}
	public void catchMouse() {
		System.out.println(getColor()+"ץ����");
	}
}
class Dog extends Animal{
	public Dog() {}
	public Dog(String color,int num) {
		super(color,num);
	}
	public void eat() {
		System.out.println("������");
	}
	public void lookHome() {
		System.out.println("������");
	}
}
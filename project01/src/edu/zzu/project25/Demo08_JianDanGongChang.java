package edu.zzu.project25;


public class Demo08_JianDanGongChang {

	public static void main(String[] args) {
		/*
		 * Dog g = AnimayFactory.creatDog(); g.eat();
		 */
		Dog d = (Dog)AnimayFactory.creatAnimal("dog");
		d.eat();
          
	}

}
/**
 * 
 * @ClassName: Animal
 * @Description: ����ģʽ�����ڶ������ʱ��Ҫ�������룬������̫��
 * @author sys
 * @date 2020-03-05 05:24:14
 */
 abstract class Animal{
	public abstract void eat();
}
 
 class Dog extends Animal{
	 public void eat() {
		 System.out.println("������");
	 }
 }
 class Cat extends Animal{
	 public void eat() {
		 System.out.println("è����");
	 }
 }
 class AnimayFactory{
	/*
	 * public static Dog creatDog() { return new Dog(); } public static Cat
	 * creatCat() { return new Cat(); }
	 */
	 public static Animal creatAnimal(String name) {
		 if("cat".equals(name)) {
			 return new Cat();
		 }else if("dog".equals(name)) {
			 return new Dog();
		 }else {
			 return null;
		 }
	 }
 }
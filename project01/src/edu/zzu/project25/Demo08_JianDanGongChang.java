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
 * @Description: 单例模式：存在多个子类时需要大量代码，复用性太差
 * @author sys
 * @date 2020-03-05 05:24:14
 */
 abstract class Animal{
	public abstract void eat();
}
 
 class Dog extends Animal{
	 public void eat() {
		 System.out.println("狗吃肉");
	 }
 }
 class Cat extends Animal{
	 public void eat() {
		 System.out.println("猫吃鱼");
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
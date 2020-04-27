package edu.zzu.project08;

public class Test_Animals {

	public static void main(String[] args) {
		Cat cat = new Cat("花猫",4);
		System.out.println(cat.getColor()+"......"+cat.getNum());
        cat.eat();
        cat.catchMouse();
	}

}
/*
 * A:猫狗案例分析
 * B：案例演示：
 *       猫狗案例继承版
 *       属性：毛的颜色，腿的个数
 *       行为：吃饭
 *       猫特有行为：抓老鼠catchMouse
 *       狗也有行为：看家lookHome
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
		System.out.println("吃饭");
	}
}
class Cat extends Animal{
	public Cat() {}
	public Cat(String color,int num) {
		super(color,num);
	}
	public void eat() {
		System.out.println(getColor()+"吃鱼");
	}
	public void catchMouse() {
		System.out.println(getColor()+"抓老鼠");
	}
}
class Dog extends Animal{
	public Dog() {}
	public Dog(String color,int num) {
		super(color,num);
	}
	public void eat() {
		System.out.println("狗吃肉");
	}
	public void lookHome() {
		System.out.println("狗看家");
	}
}
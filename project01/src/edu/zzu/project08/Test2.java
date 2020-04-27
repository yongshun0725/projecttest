package edu.zzu.project08;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * 代码中B类中没有show方法，但是父类中有，默认继承show方法，
		 * 在父类中的show方法调用了show2方法，由于运行时时看子类的方法，
		 * 因此实际运行时时调用的子类的show2方法
		 */
		A a = new B();
		a.show();
		/*
		 * 代码中C类中show方法时调用了父类的show方法，
		 * 在父类中的show方法调用了show2方法，由于运行时时看子类的方法，
		 * 因此实际运行时时调用的也是子类的show2方法
		 */
        B b = new C();
        b.show();
	}
}
class A{
	public void show() {
		show2();
	}
	public void show2() {
		System.out.println("我");
	}
}
class B extends A{
	
	public void show2() {
		System.out.println("爱");
	}
}
class C extends B{
	public void show() {
		super.show();
	}
	public void show2() {
		System.out.println("你");
	}
}
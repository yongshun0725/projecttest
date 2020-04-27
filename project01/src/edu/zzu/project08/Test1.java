package edu.zzu.project08;

public class Test1 {

	public static void main(String[] args) {
		Father1 f1 = new Son1(); 
		System.out.println(f1.num);
        f1.method();
        f1.print();
        Son1 son2 = (Son1)f1;
	}

}
class Father1{
	int num = 10;
	
	public void print() {
		System.out.println("father print");
	}
	
	public static void method() {
		System.out.println("fanter method");
	}
	
}
class Son1 extends Father1{
	int num = 20;
	public void print() {
		System.out.println("son print");
	}
	
	public static void method() {
		System.out.println("son method");
	}
}

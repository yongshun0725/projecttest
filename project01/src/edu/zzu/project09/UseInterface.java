package edu.zzu.project09;

public class UseInterface {

	public static void main(String[] args) {
		TestInterface t = new UseInter();
		t.print();
		

	}

}
interface TestInterface{
	public abstract void print();
}
class UseInter implements TestInterface{
	public void print() {
		System.out.println("123");
	}
}
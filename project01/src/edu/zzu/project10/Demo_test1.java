package edu.zzu.project10;

public class Demo_test1 {

	public static void main(String[] args) {
//		Test1 t = new Test1();
//		t.method();
//		Test2.Test2_Test t2 = new Test2.Test2_Test();
//		t2.show();
//		Test2.Test2_Test2.show();
//		Test3.Test3_Test t3 = new Test3().new Test3_Test();
//		t3.show();
//		Test4 t4 = new Test4();
//		t4.method();
		Test4 t5= new Test4();
		t5.test(new Test5() {
			public void show() {
				System.out.println("当做参数的匿名内部类");
			}
		});
	}

}
//interface Test_Jk{
//	public static abstract void show();
//}
class Test1{    //局部内部类
	public Test1() {}
	public void method() {
		final int a = 10;
		class Inner{
		    public void show() {
		    	System.out.println(a);
		    }
		}
		new Inner().show();
	}
}
class Test2{    //静态内部类
	static class Test2_Test{
		public void show() {
			System.out.println("经阿嚏内部类");

		}
	}
	static class Test2_Test2{
		public static void show() {
			System.out.println("111111111111111111");
		}
	}
}
class Test3{        //成员内部类
	private int num = 10;
	class Test3_Test{
		public void show() {
			System.out.println(num);
		}
	}
	
}
interface Test5{
	public abstract void show();
}
class Test4{  //匿名内部类
//	class Inner implements Test5{
//		public void show() {
//			System.out.println("inner1");
//		}
//	}
	public void method() {
//		Inner in= new Inner();
//		in.show();
		new Test5() {
			public void show() {
				System.out.println("inner2");
			}
		}.show();
	}
	public void test(Test5 t) {
		t.show();
	}
}
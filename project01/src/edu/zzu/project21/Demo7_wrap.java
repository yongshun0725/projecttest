package edu.zzu.project21;


public class Demo7_wrap {

	public static void main(String[] args) {
         TestStudent ts = new TestStudent(new Student());
         ts.code();
	}

}


interface Coder{
	public abstract void code();
}
class Student implements Coder{
	public void code() {
		System.out.println("javase");
		System.out.println("javaweb");
	}
}

class TestStudent implements Coder{
	private Student s;

	public TestStudent() {
		super();
	}

	public TestStudent(Student s) {
		super();
		this.s = s;
	}

	@Override
	public void code() {
		s.code();
		System.out.println("´óÊý¾Ý");
	}

	
    
}
package edu.zzu.project19;

public class Demo01_Exception {

	public static void main(String[] args) {
      Demo demo = new Demo();
      System.out.println(demo.div(10, 0));
	}

}
class Demo{
	public int div(int a, int b) {
		return a/b;
	}
}
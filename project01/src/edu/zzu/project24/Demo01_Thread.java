package edu.zzu.project24;


public class Demo01_Thread {

	public static void main(String[] args) {
         MyThread mt = new MyThread();
         mt.start();
         new MyThread2().start();
         for (int i = 0; i < 10; i++) {
			System.out.println("bbbbbbbbbbbbbbbb");
		}
	}

}
class MyThread extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("aaaaaaaaaaaaa");
		}
	}
}
class MyThread2 extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("cccccc");
		}
	}
}

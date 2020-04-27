package edu.zzu.project24;


public class Demo02_Runnable {

	public static void main(String[] args) {
		Thread t = new Thread(new MyRunnable());
        t.start();
        for (int i = 0; i < 1000; i++) {
			System.out.println("eeeeeeeeeeeeeeeeeeee");
		}
        
	}

}

class MyRunnable implements Runnable{
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("dddddd");
		}
	}
}
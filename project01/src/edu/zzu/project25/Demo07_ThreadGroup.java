package edu.zzu.project25;


public class Demo07_ThreadGroup {

	public static void main(String[] args) {
         //demo1();
		ThreadGroup tg1 = new ThreadGroup("����һ�����߳�");
		MyRunnable mr = new MyRunnable();
		
		Thread t1 = new Thread(tg1, mr, "����");
		Thread t2 = new Thread(tg1, mr, "����");
		
		System.out.println(t1.getThreadGroup().getName());
		System.out.println(t2.getThreadGroup().getName());
		
	}

	private static void demo1() {
		MyRunnable mr = new MyRunnable();
         Thread r = new Thread(mr);
         Thread r2 = new Thread(mr);
         
         ThreadGroup tg1 = r.getThreadGroup();
         ThreadGroup tg2 = r2.getThreadGroup();
         System.out.println(tg1.getName());
         System.out.println(tg2.getName());
	}

}

class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 1000; i++){
			System.out.println(Thread.currentThread().getName()+"........"+i);
		}
	}
	
}
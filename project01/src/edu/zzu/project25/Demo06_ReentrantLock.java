package edu.zzu.project25;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Demo06_ReentrantLock {
	/**
	 * 
	 * @param args jdk 1.5新特性
	 * 
	 */
	public static void main(String[] args) {
		Printer3 p = new Printer3();
		new Thread() {
			public void run() {
				while(true) {
					p.print1();
				}
			}
		}.start();
		new Thread() {
			public void run() {
				while(true) {
					p.print2();
				}
			}
		}.start();
		new Thread() {
			public void run() {
				while(true) {
					p.print3();
				}
			}
		}.start();;
	}

}

class Printer3 {
	private ReentrantLock rt = new ReentrantLock();
	private Condition c1 = rt.newCondition();
	private Condition c2 = rt.newCondition();
	private Condition c3 = rt.newCondition();
	private int flag = 1;

	public void print1() {
		rt.lock();
			while (flag != 1) {
				try {
					c1.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.print("我");
			System.out.print("爱");
			System.out.print("去");
			System.out.print("学");
			System.out.println("习");
			flag = 3;
			c3.signal();
		rt.unlock();

	} 

	public void print2() {
		rt.lock();
			while (flag != 2) {
			    try {
					c2.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.print("你");
			System.out.print("可");
			System.out.print("拉");
			System.out.print("倒");
			System.out.println("吧");
			flag = 1;
			c1.signal();
		rt.unlock();
	}

	public void print3() {
		rt.lock();
			while (flag != 3) {
				try {
					c3.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.print("a");
			System.out.print("b");
			System.out.print("c");
			System.out.print("d");
			System.out.println("e");
			flag = 2;
			c2.signal();
		rt.unlock();

	}
}
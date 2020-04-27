package edu.zzu.project25;

/**
 * 
 * @ClassName: Demo5_NotifyAll
 * @Description: TODO(描述)
 * @author sys
 * @date 2020-03-05 01:55:46
 */
public class Demo05_NotifyAll {

	public static void main(String[] args) {
		final Printer2 p =new Printer2();
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
          }.start();
	}

}

class Printer2{
	private int flag = 1;
	public void print1() {
		synchronized (this) {
			while(flag != 2) {
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.print("你");
			System.out.print("可");
			System.out.print("拉");
			System.out.print("倒");
			System.out.println("吧");
			flag = 3;
			this.notifyAll();
		}
	}
	/**
	 * 1.在同步代码块，用哪个对象就用哪个对象调用wait方法
	 * 2.为什么wait和notify这些方法要定义在Object这个类中
	 *    锁对象可以使任意对象，那么任意对象都是Object的子类，即Object是所有类的基类，将方法定义在Object
	 *    中可以让任意对象进行调用
	 * 3.sleep和wait的区别
	 *   a.sleep在同步代码块或同步函数中，不释放锁
	 *     wait在同步在同步代码块或同步函数中，释放锁
	 *   b.sleep方法传入参数，到时间就自动醒来
	 *     wait方法也可以传入参数，也可以不传入参数
	 *     如果wait方法传入时间参数，用法与sleep相似，到时间停止等待（通常用的都是没有参数的wait方法）
	 *    
	 *
	 */
	public void print2() {
		synchronized (this) {
			while(flag != 1) {
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.print("我");
			System.out.print("爱");
			System.out.print("去");
			System.out.print("学");
			System.out.println("习");
			flag = 2;
			this.notifyAll();
		}
		
	}
	public void print3() {
		synchronized (this) {
			while(flag != 3) {
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.print("a");
			System.out.print("b");
			System.out.print("c");
			System.out.print("d");
			System.out.println("e");
			flag = 1;
			this.notifyAll();
		}
		
	}
}
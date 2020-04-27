package edu.zzu.project25;


public class Demo04_Notify {

	public static void main(String[] args) {
          final Printer p = new Printer();
          new Thread() {
        	  public void run() {
        	     	while(true) {
        	     		p.print1();   
        	     	}
        	  }
          }.start();;
          new Thread() {
        	  public void run() {
        		  while(true) {
      	     		p.print2();   
      	     	}
        	  }
          }.start();;
	}

}

class Printer{
	private int flag = 1;
	public  void print1() {
		synchronized (this) {
			if(flag != 2) {
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
			flag = 1;
			this.notify();
		}
	}
	public synchronized void print2() {
		synchronized (this) {
			if(flag != 1) {
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
			flag = 2;
			this.notify();
		}
		
	}
}
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
			System.out.print("��");
			System.out.print("��");
			System.out.print("ȥ");
			System.out.print("ѧ");
			System.out.println("ϰ");
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
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.println("��");
			flag = 2;
			this.notify();
		}
		
	}
}
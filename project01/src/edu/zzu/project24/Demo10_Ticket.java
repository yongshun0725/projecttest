package edu.zzu.project24;


public class Demo10_Ticket {

	public static void main(String[] args) {
         new Ticket().start();
         new Ticket().start();
         new Ticket().start();
         new Ticket().start();
	}

}
class Ticket extends Thread{
	private static int ticket = 100;
	
	
	public Ticket() {
		super();
		
	}
	public Ticket(Runnable target, String name) {
		super(target, name);
		
	}
	public Ticket(Runnable target) {
		
		super(target);
		
	}
	public Ticket(ThreadGroup group, Runnable target, String name, long stackSize) {
		/*****/
		super(group, target, name, stackSize);
		
	}
	public Ticket(ThreadGroup group, Runnable target, String name) {
		/*****/
		super(group, target, name);
		
	}
	public Ticket(ThreadGroup group, Runnable target) {
		/*****/
		super(group, target);
		
	}
	public Ticket(ThreadGroup group, String name) {
		/*****/
		super(group, name);
		
	}
	public Ticket(String name) {
		this.setName(name);
	}
	public void run() {
		
		while(true) {
			synchronized (Ticket.class) {
				if(ticket <= 0) {
					System.out.println("票卖完了！！");
					break;
				}
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("这是"+getName()+"卖的第"+ticket--+"号票！");
			}
		}
	}
	
}

package edu.zzu.project24;


public class Demo11_Ticket {

	public static void main(String[] args) {
        MyTicket my = new MyTicket();
        new Thread(my).start();
        new Thread(my).start();
        new Thread(my).start();
        new Thread(my).start();
	}

}
class MyTicket implements Runnable{
private static int ticket = 100;
	
	public void run() {
		
		while(true) {
			synchronized (Ticket.class) {
				if(ticket <= 0) {
					System.out.println("Ʊ�����ˣ���");
					break;
				}
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("����"+Thread.currentThread().getName()+"���ĵ�"+ticket--+"��Ʊ��");
			}
		}
	}
}

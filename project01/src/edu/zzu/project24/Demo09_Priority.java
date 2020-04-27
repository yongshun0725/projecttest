package edu.zzu.project24;


public class Demo09_Priority {

	public static void main(String[] args) {
       Thread t1 = new Thread() {
    	  public void run() {
    		  for (int i = 0; i < 1000; i++) {
    			  System.out.println(getName()+".....aaaa");
			}
    	  }
       };
       Thread t2 = new Thread() {
     	  public void run() {
     		  for (int i = 0; i < 1000; i++) {
     			  System.out.println(getName()+".....bbbbbbbbb");
 			}
     	  }
        };
        t1.setPriority(10);
        t2.setPriority(1);
        t1.start();
        t2.start();
	}

}


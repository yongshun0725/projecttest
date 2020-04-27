package edu.zzu.project24;


public class Demo05_CurrentThread {

	public static void main(String[] args) {
       new Thread() {
    	   public void run() {
    		   System.out.println(getName()+"aaaaaaaa");
    	   }
       }.start();
       
       new Thread(new Runnable() {
   		@Override
   		public void run() {
   			System.out.println(Thread.currentThread().getName()+"bbbbbbbb");
   		}
   	}).start();
       System.out.println(Thread.currentThread().getName());
	}

}


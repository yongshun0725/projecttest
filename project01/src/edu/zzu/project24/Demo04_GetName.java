package edu.zzu.project24;


public class Demo04_GetName {

	public static void main(String[] args) {
         //demo1();
		Thread t1 = new Thread() {
			public void run() {
				//this.setName("张三");
				System.out.println(this.getName()+"aaaaaaaa");
			}
		};
		t1.setName("张三");
		t1.start();
		new Thread() {
			public void run() {
				this.setName("李四");
				System.out.println(this.getName()+"bbbbbbbb");
			}
		}.start();
	}

	private static void demo1() {
		new Thread("汝荣姐姐") {
        	 public void run() {
        		 for (int i = 0; i < 100; i++) {
        			 System.out.println(this.getName()+"  aaaaaaaaa");
				}
        	 }
         }.start();
	}

}


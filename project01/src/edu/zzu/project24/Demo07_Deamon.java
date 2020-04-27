package edu.zzu.project24;

public class Demo07_Deamon {

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 20; i++) {
					System.out.println(getName() + "aaaaaaaa");
				}
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				for (int i = 0; i < 20; i++) {
					System.out.println(getName() + "bbbbbbbbbbb");
				}
			}
		};
		t2.setDaemon(true);
		t1.start();
		t2.start();
	}

}

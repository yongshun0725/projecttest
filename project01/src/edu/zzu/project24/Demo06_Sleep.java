package edu.zzu.project24;


public class Demo06_Sleep {

	public static void main(String[] args) throws InterruptedException {
       // demo1();
		new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(getName()+"aaaaaaa");
				}
			}
		}.start();
		new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(getName()+"bbbbbbbbbbbbbbb");
				}
			}
		}.start();
	}

	private static void demo1() throws InterruptedException {
		for (int i = 20; i >= 0; i--) {
			System.out.println("µπº∆ ±£∫"+i+"√Î");
			Thread.sleep(1000);
		}
	}

}


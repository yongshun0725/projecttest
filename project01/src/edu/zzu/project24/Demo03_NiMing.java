package edu.zzu.project24;


public class Demo03_NiMing {
   /**
    * 
    * @param args   
    * ʹ�������ڲ���ʵ�ֶ��߳�
    */
	public static void main(String[] args) {
         new Thread() {
        	 public void run() {
        	      for (int i = 0; i < 1000; i++) {
					System.out.println("aaaa");
				}	 
        	 }
         }.start();
         new Thread(new Runnable() {
 			@Override
 			public void run() {
 				for (int i = 0; i < 1000; i++) {
 					System.out.println("bbbbbbbbbbbbbb");
 				}	 
 			}
 		}).start();;
	}

}


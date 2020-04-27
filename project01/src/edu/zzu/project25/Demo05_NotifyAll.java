package edu.zzu.project25;

/**
 * 
 * @ClassName: Demo5_NotifyAll
 * @Description: TODO(����)
 * @author sys
 * @date 2020-03-05 01:55:46
 */
public class Demo05_NotifyAll {

	public static void main(String[] args) {
		final Printer2 p =new Printer2();
          new Thread() {
        	public void run() {
        		while(true) {
        			p.print1();
        		}
        	}
          }.start();
          
          new Thread() {
        	public void run() {
        		while(true) {
        			p.print2();
        		}
        	}
          }.start();
         
          new Thread() {
        	public void run() {
        		while(true) {
        			p.print3();
        		}
        	}
          }.start();
	}

}

class Printer2{
	private int flag = 1;
	public void print1() {
		synchronized (this) {
			while(flag != 2) {
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
			flag = 3;
			this.notifyAll();
		}
	}
	/**
	 * 1.��ͬ������飬���ĸ���������ĸ��������wait����
	 * 2.Ϊʲôwait��notify��Щ����Ҫ������Object�������
	 *    ���������ʹ���������ô���������Object�����࣬��Object��������Ļ��࣬������������Object
	 *    �п��������������е���
	 * 3.sleep��wait������
	 *   a.sleep��ͬ��������ͬ�������У����ͷ���
	 *     wait��ͬ����ͬ��������ͬ�������У��ͷ���
	 *   b.sleep���������������ʱ����Զ�����
	 *     wait����Ҳ���Դ��������Ҳ���Բ��������
	 *     ���wait��������ʱ��������÷���sleep���ƣ���ʱ��ֹͣ�ȴ���ͨ���õĶ���û�в�����wait������
	 *    
	 *
	 */
	public void print2() {
		synchronized (this) {
			while(flag != 1) {
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
			flag = 2;
			this.notifyAll();
		}
		
	}
	public void print3() {
		synchronized (this) {
			while(flag != 3) {
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.print("a");
			System.out.print("b");
			System.out.print("c");
			System.out.print("d");
			System.out.println("e");
			flag = 1;
			this.notifyAll();
		}
		
	}
}
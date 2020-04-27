package edu.zzu.project25;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Demo03_Timer  {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException{
		Timer t = new Timer();
		//��ָ��ʱ�䰲��ָ������
		//��һ������,�ǰ��ŵ�����,�ڶ���������ִ�е�ʱ��,�����������ǹ��೤ʱ�����ظ�ִ��
		t.schedule(new MyTimerTask(), new Date(120, 3, 4, 17, 36, 50),3000);	
		
		while(true) {
			Thread.sleep(1000);
			System.out.println(new Date());
		}
	}

}
class MyTimerTask extends TimerTask {

	@Override
	public void run() {
		System.out.println("�𴲱�Ӣ�ﵥ��");
	}
}

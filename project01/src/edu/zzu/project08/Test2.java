package edu.zzu.project08;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * ������B����û��show���������Ǹ������У�Ĭ�ϼ̳�show������
		 * �ڸ����е�show����������show2��������������ʱʱ������ķ�����
		 * ���ʵ������ʱʱ���õ������show2����
		 */
		A a = new B();
		a.show();
		/*
		 * ������C����show����ʱ�����˸����show������
		 * �ڸ����е�show����������show2��������������ʱʱ������ķ�����
		 * ���ʵ������ʱʱ���õ�Ҳ�������show2����
		 */
        B b = new C();
        b.show();
	}
}
class A{
	public void show() {
		show2();
	}
	public void show2() {
		System.out.println("��");
	}
}
class B extends A{
	
	public void show2() {
		System.out.println("��");
	}
}
class C extends B{
	public void show() {
		super.show();
	}
	public void show2() {
		System.out.println("��");
	}
}
package edu.zzu.project25;

public class Demo01_Singleton {

	/**
	 * 
	 * @param args ��Ƶ���ģʽ���ڴ���ֻ����һ������
	 */
	public static void main(String[] args) {
		// Singleton s1 = Singleton.getInstance();
		// Singleton s2 = Singleton.getInstance();
		// System.out.println(s1 == s2);
	}

}

class Singleton1 { // ˽�й��췽��,�����಻�ܷ��ʸù��췽��
	private Singleton1() {
	}

	// �����������,˽�г�Ա����������ʹ������.����
	private static Singleton1 s = new Singleton1();

	// ��ȡʵ��
	public static Singleton1 getInstance() {
		return s;
	}
}

class Singleton2 {
	private Singleton2() {
	}

	private static Singleton2 s;

	public static Singleton2 getInstance() {
		if (s == null) {
			s = new Singleton2();
		}

		return s;

	}
}

class Singleton {
	private Singleton() {
	}

	public static final Singleton s = new Singleton();

	
}

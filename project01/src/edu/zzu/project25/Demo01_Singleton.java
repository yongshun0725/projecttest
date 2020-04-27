package edu.zzu.project25;

public class Demo01_Singleton {

	/**
	 * 
	 * @param args 设计单例模式，内存中只能有一个对象
	 */
	public static void main(String[] args) {
		// Singleton s1 = Singleton.getInstance();
		// Singleton s2 = Singleton.getInstance();
		// System.out.println(s1 == s2);
	}

}

class Singleton1 { // 私有构造方法,其他类不能访问该构造方法
	private Singleton1() {
	}

	// 创建本类对象,私有成员变量，不能使用类名.调用
	private static Singleton1 s = new Singleton1();

	// 获取实例
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

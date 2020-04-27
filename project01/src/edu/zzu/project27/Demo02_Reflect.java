package edu.zzu.project27;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;

public class Demo02_Reflect {

	public static void main(String[] args) throws Exception {
		/*
		 * Juicer j = new Juicer(); j.run(new Apple());
		 */

		// demo1();
		Class clazz = Class.forName("edu.zzu.project27.Person");
		Constructor c = clazz.getConstructor(String.class,int.class);
		
		Person p = (Person) c.newInstance("张三",25);
		System.out.println(p);

	}

	private static void demo1() throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("config.properites"));
		Class clazz = Class.forName(br.readLine());
		Fruit f = (Fruit) clazz.newInstance();
		Juicer j = new Juicer();
		j.run(f);
	}

}

interface Fruit {
	public void squeeze();
}

class Apple implements Fruit {
	@Override
	public void squeeze() {
		System.out.println("炸出苹果汁！！");
	}
}

class Juicer {
	public void run(Fruit f) {
		f.squeeze();
	}
}
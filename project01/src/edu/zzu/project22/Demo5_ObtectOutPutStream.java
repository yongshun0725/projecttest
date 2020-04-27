package edu.zzu.project22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo5_ObtectOutPutStream {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Person p1 = new Person("张三", 23);
		Person p2 = new Person("李四", 24);
		Person p3 = new Person("王五", 25);
		Person p4 = new Person("赵六", 26);
		List<Person> list = new ArrayList<Person>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d.txt"));
		oos.writeObject(list);
		oos.close();

		demo1();
	}

	private static void demo1() throws IOException, FileNotFoundException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d.txt"));
		Person p1 = (Person) ois.readObject();
		System.out.println(p1);
	}

}

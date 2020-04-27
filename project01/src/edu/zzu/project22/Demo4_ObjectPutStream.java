package edu.zzu.project22;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



public class Demo4_ObjectPutStream {

	public static void main(String[] args) throws IOException {
        Person p1 = new Person("张三",23);
        Person p2 = new Person("李四",24);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d.txt"));
        
        oos.writeObject(p1);
        oos.writeObject(p2);
        oos.close();
	}

}

class Person implements Serializable{
	/**  
	 * @Fields serialVersionUID : TODO(描述)
	 * @author sys
	 * @date 2020-02-29 05:25:57 
	 */ 
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	public Person() {
		super();
		
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}

package edu.zzu.project11;

public class Demo1_Object {

	public static void main(String[] args) {
      Object ob = new Object();
      int i = ob.hashCode();
      //System.out.println(i);
      Person_Test p1 = new Person_Test("账单","下摆",15);
      Person_Test p2 = new Person_Test("账单","下摆",16);
      Person_Test p3 = p1;
      System.out.println(p1.equals(p2));
      //System.out.println(p1.getClass().getName());
      //System.out.println(p2.hashCode());
      //System.out.println(p1.toString());
	}
/*
 * ==和equals的比较：
 *  共同点：都可以做比较，返回值都为boolean
 *  区别1：==号是比较运算符，既可以比较基本数据类型，也可以比较引用数据类型，基本数据类型比较是值，引用数据类型比较的是地址
 *      2：equals方法只能比较引用数据类型，equals没有重写之前是比较地址，相当于==，但是比较地址是没有意义的
 */
}

class Person_Test {
	private String name;
	private String id;
	private int gz;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getGz() {
		return gz;
	}

	public void setGz(int gz) {
		this.gz = gz;
	}

	public Person_Test() {

	}
	public Person_Test(String name,String id, int gz) {
           this.name = name;
           this.id = id;
           this.gz = gz;
	}

	@Override
	public String toString() {
		return "Person_Test [name=" + name + ", id=" + id + ", gz=" + gz + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Person_Test p = (Person_Test)obj;
		return this.name.equals(p.name)&&this.id.equals(p.id)&&this.gz == p.gz;
	}

//	@Override
//	public String toString() {
//		return "我的姓名是："+name;
//	}
//	public boolean equals(Person_Test person) {
//		if(this.getName() == person.getName() && this.id == person.id && this.gz == person.gz) {
//			return true;
//		}else {
//			return false;
//		}
//	}
	
}
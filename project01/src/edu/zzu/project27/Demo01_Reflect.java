package edu.zzu.project27;


public class Demo01_Reflect {

	public static void main(String[] args) throws Exception {
       Class clazz1 = Class.forName("edu.zzu.project27.Person");
       Class clazz2 = Person.class;
       
       Class clazz3 = new Person().getClass();
       
       System.out.println(clazz1 == clazz2);
       System.out.println(clazz2 == clazz3);
	}

}

class Person{
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
    
	public void eat() {
		System.out.println("�������һ�ٽ�Ǯ��");
	}
	
	public void eat(int num) {
		System.out.println("�������"+num+"һ�ٽ�Ǯ��");
	}
}
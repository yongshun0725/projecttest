package edu.zzu.project12;

public class Demo6_StringMethod {

	public static void main(String[] args) {
//        Person p = new Person(15, 15);
//        Person p2 = new Person(15, 15);
//        System.out.println(p);
//        System.out.println(p.getClass().getName());
//         System.out.println(p.hashCode() == p2.hashCode());
//         System.out.println(p.equals(p2));
//		byte []by = {'3','2','8','6'};
//		char []ch = {'a','b','c'};
//        String s1 = new String(by,1,3);
//        System.out.println(s1);
//		 String s1 = new String("abc");			
//		 String s2 = "abc";
//		 System.out.println(s1 == s2);		
//		 System.out.println(s1.equals(s2));
//       String s1 = "a" + "b" + "c";
//		 String s2 = "abc";
//		 System.out.println(s1 == s2);
//		 System.out.println(s1.hashCode());
//		 System.out.println(s2.hashCode());
		 String s1 = "abcdefghi";
//		 System.out.println(s1.contains("abc"));
//		 System.out.println(s1.startsWith("abc"));
//		 System.out.println(s1.endsWith("a"));
//		 System.out.println(s1.equals("abcdefghi"));
//		 System.out.println(s1.equals("abcdefghI"));
//		 System.out.println(s1.equalsIgnoreCase("abcdefghi"));
		 System.out.println(s1.charAt(0));
		 System.out.println(s1.substring(1,5));
		 System.out.println(s1.indexOf("bcd"));
		 System.out.println();
	}

}
class Person{
	private int age;
	private int id;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Person(int age, int id) {
		super();
		this.age = age;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", id=" + id + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
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
		if (id != other.id)
			return false;
		return true;
	}
    
	
	
}

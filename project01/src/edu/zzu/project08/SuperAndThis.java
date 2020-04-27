package edu.zzu.project08;

class Father{
     private String name;
     private int age;
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
     public Father() {
    	 System.out.println("father无参构造！");
     }
     public Father(String name , int age) {
    	 this.name = name;
    	 this.age = age;
    	 System.out.println("father有参构造！");
     }
}
class Son extends Father{
	public Son() {
  	  System.out.println("son无参构造！");
    }
    public Son(String name , int age) {
      super(name,age);
  	  System.out.println("son有参构造！");
    }
}
public class SuperAndThis{
      public static void main(String []args) {
    	  Son son = new Son("张三",20);
    	  System.out.println(son.getName());
      }
}

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
    	 System.out.println("father�޲ι��죡");
     }
     public Father(String name , int age) {
    	 this.name = name;
    	 this.age = age;
    	 System.out.println("father�вι��죡");
     }
}
class Son extends Father{
	public Son() {
  	  System.out.println("son�޲ι��죡");
    }
    public Son(String name , int age) {
      super(name,age);
  	  System.out.println("son�вι��죡");
    }
}
public class SuperAndThis{
      public static void main(String []args) {
    	  Son son = new Son("����",20);
    	  System.out.println(son.getName());
      }
}

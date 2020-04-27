package edu.zzu.project09;

public class Test2 {

	public static void main(String[] args) {
//		Jl j = new Jl("ji","123",12,30000.0);
//		System.out.println(j.getBt());
//		System.out.println(j.getGz());
		int arr[] = {1,2,3,4,5,6};
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}

abstract class Person_Test{
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
	/**
	 * @Title: Person_Test
	 * @Description: Person_Test¹¹Ôìº¯Êý
	 * @param name
	 * @param id
	 * @param gz
	 * @author sys
	 * @date 2020-02-11 10:06:32
	 */
	public Person_Test(String name,String id,int gz) {
		this.name = name ;
		this.id = id;
		this.gz = gz;
	}
}
class Jl extends Person_Test{
     private double bt;

	public double getBt() {
		return bt;
	}

	public void setBt(double bt) {
		this.bt = bt;
	}
	public Jl() {
			
		}
	public Jl(String name,String id,int gz,double d) {
		
		super(name,id,gz);
		this.bt = d;
	}
}
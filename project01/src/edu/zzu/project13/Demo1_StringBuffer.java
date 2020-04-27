package edu.zzu.project13;

public class Demo1_StringBuffer {

	public static void main(String[] args) {
       StringBuffer sb = new StringBuffer();
       System.out.println(sb.length());
       System.out.println(sb.capacity());
       
       StringBuffer sb2 = new StringBuffer(10);
       System.out.println(sb2.capacity());
       
       StringBuffer sb3 = new StringBuffer("123456");
       System.out.println(sb3.length());
       System.out.println(sb3.capacity());
	}

}

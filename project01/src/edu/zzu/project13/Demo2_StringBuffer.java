package edu.zzu.project13;

public class Demo2_StringBuffer {

	public static void main(String[] args) {
      StringBuffer sb = new StringBuffer();
      StringBuffer sb2 = sb.append("1008611");
      sb2.insert(1, "000000");
      System.out.println(sb);
      
      System.out.println("sb2:"+sb2);
      System.out.println(sb2.length());
      System.out.println(sb2.capacity());
	}

}

package edu.zzu.project13;

public class StringBuffer6 {

	public static void main(String[] args) {
      /*
       * StringBuffer-->String
       
		StringBuffer sb1 = new StringBuffer("121231");
		String str = sb1.toString();
		System.out.println("toString方法："+str);
		String str2 = new String(sb1);
		System.out.println("构造方法："+str2);
		String str3 = sb1.substring(0,sb1.length());
		System.out.println("sunbstring方法："+str3);
	*/
		/*
		 * String---->SubString
		 */
		String str = "10086";
		StringBuffer sb1 = new StringBuffer(str);
		System.out.println("构造方法："+sb1);
		StringBuffer sb2 = new StringBuffer();
		sb2.append(str);
		System.out.println("append方法："+sb2);
	}

}

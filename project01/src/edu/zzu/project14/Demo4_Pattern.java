package edu.zzu.project14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo4_Pattern {

	public static void main(String[] args) {
       //demo1();
      //demo2();
//		String s = "我的手机号码是：15136048453,还用过13276904725,还有13462776078";
//		String regex = "1[3578]\\d{9}";
//		Pattern p = Pattern.compile(regex);
//		Matcher m = p.matcher(s);
//		while(m.find()) {
//			System.out.println(m.group());
//		}
//      
		Math.sqrt(10);
		System.out.println(getInt());
	}
	public static int getInt() {
        int a = 10;
        try {
            System.out.println(a / 0);
            a = 20;
        } catch (ArithmeticException e) {
            a = 30;
            return a;
            /*
             * return a 在程序执行到这一步的时候，这里不是return a 而是 return 30；这个返回路径就形成了
             * 但是呢，它发现后面还有finally，所以继续执行finally的内容，a=40
             * 再次回到以前的路径,继续走return 30，形成返回路径之后，这里的a就不是a变量了，而是常量30
             */
        } finally {
            a = 40;
            return a; //如果这样，就又重新形成了一条返回路径，由于只能通过1个return返回，所以这里直接返回40
        }
 
//      return a;
    }


	private static void demo2() {
		String s = "我的手机号码是：15136048453,还用过13276904725,还有13462776078";
		  String regex = "1[3578]\\d{9}";
		  Pattern p = Pattern.compile(regex);
		  Matcher m = p.matcher(s);
		  while(m.find()) {
			  System.out.println(m.group());
		  }
	}

	private static void demo1() {
		Pattern p = Pattern.compile("[abc]");
		  Matcher m = p.matcher("bc");
		  boolean b = m.matches();
		  System.out.println(b);
	}

}

package edu.zzu.project14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo4_Pattern {

	public static void main(String[] args) {
       //demo1();
      //demo2();
//		String s = "�ҵ��ֻ������ǣ�15136048453,���ù�13276904725,����13462776078";
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
             * return a �ڳ���ִ�е���һ����ʱ�����ﲻ��return a ���� return 30���������·�����γ���
             * �����أ������ֺ��滹��finally�����Լ���ִ��finally�����ݣ�a=40
             * �ٴλص���ǰ��·��,������return 30���γɷ���·��֮�������a�Ͳ���a�����ˣ����ǳ���30
             */
        } finally {
            a = 40;
            return a; //������������������γ���һ������·��������ֻ��ͨ��1��return���أ���������ֱ�ӷ���40
        }
 
//      return a;
    }


	private static void demo2() {
		String s = "�ҵ��ֻ������ǣ�15136048453,���ù�13276904725,����13462776078";
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

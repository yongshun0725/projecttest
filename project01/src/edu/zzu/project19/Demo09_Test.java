package edu.zzu.project19;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Demo09_Test {

	/*
	 * 键盘录入一个int类型，求其二进制形式 如果录入较大，给与提示，录入过大的整数请重新录入一个biginterger
	 * 如果录入的是一个小数，给与提示，从新录入 如果录入其他字符，给与提示字符非法，重新录入
	 *
	 *
	 * 分析： 1.键盘录入对象 2.将键盘录入结果存入字符串，避免不符合录入影响后续 3.转换为int，判断是否正确 4.直接转换 5.错误提示
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数：");
		
		while(true) {
			String str = sc.nextLine();
			try {
				int num = Integer.parseInt(str);
	            System.out.println(Integer.toBinaryString(num));
	            break;   
			} catch (Exception e) {
               try{
            	   new BigInteger(str);
            	   System.out.println("录入错误，你录入的是一个过大整数，重新录入");
               }catch(Exception e2) {
            	    try {
            	    	new BigDecimal(str);
            	    	System.out.println("录入错误，你录入的是一个小数，重新录入");
            	    }catch(Exception e3) {
            	    	System.out.println("录入错误，你录入的是一个字符，重新录入");
            	    } 
               }
			}
		}
	}

}

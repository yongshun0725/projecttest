package edu.zzu.project19;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Demo09_Test {

	/*
	 * ����¼��һ��int���ͣ������������ʽ ���¼��ϴ󣬸�����ʾ��¼����������������¼��һ��biginterger
	 * ���¼�����һ��С����������ʾ������¼�� ���¼�������ַ���������ʾ�ַ��Ƿ�������¼��
	 *
	 *
	 * ������ 1.����¼����� 2.������¼���������ַ��������ⲻ����¼��Ӱ����� 3.ת��Ϊint���ж��Ƿ���ȷ 4.ֱ��ת�� 5.������ʾ
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		
		while(true) {
			String str = sc.nextLine();
			try {
				int num = Integer.parseInt(str);
	            System.out.println(Integer.toBinaryString(num));
	            break;   
			} catch (Exception e) {
               try{
            	   new BigInteger(str);
            	   System.out.println("¼�������¼�����һ����������������¼��");
               }catch(Exception e2) {
            	    try {
            	    	new BigDecimal(str);
            	    	System.out.println("¼�������¼�����һ��С��������¼��");
            	    }catch(Exception e3) {
            	    	System.out.println("¼�������¼�����һ���ַ�������¼��");
            	    } 
               }
			}
		}
	}

}

package edu.zzu.project14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo9_1_Test {
/* 
 * A:��������
 * ������һ����������������������
 * ������
 * 1.�������ַ����ͽ����ַ�������String���Ͷ�����
 * 2.�������ڸ�ʽ������
 * 3.�������ַ���ת��Ϊ���ڶ���
 * 4.ͨ�����ڶ����ȡ����ֵ
 * 5.�������������ֵ���
 */
	public static void main(String[] args) throws ParseException {
    //�����ձ���
		String bir = "1996��07��25��";
		String today = "2020��02��16��";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
		Date d1 = sdf.parse(bir);
		Date d2 = sdf.parse(today);
		long time = d2.getTime() - d1.getTime();
		System.out.println(time / 1000 / 60 /60 / 24 / 365);
	}

}

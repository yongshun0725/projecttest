package edu.zzu.project14;

import java.util.Arrays;

/**
 * 
 * @ClassName: Demo1_Regist
 * @Description: ������ʽ����ϰ
 * @author sys
 * @date 2020-02-15 10:54:34
 */
public class Demo1_Regist {

	public static void main(String[] args) {
		String str = "12 3 6 78 96 5 1";
		String s[] = str.split(" ");
		int[] i = new int[s.length];
		for(int a = 0; a < i.length; a++) {
			i[a] = Integer.parseInt(s[a]);
		}
		Arrays.sort(i);
		System.out.println(Arrays.toString(i));
		
	}



	private static void demo1() {
		String regex = "\\d";
		System.out.println("1".matches(regex));
	}

	

	/*
	 * ���󣺼���qq�����Ƿ����Ҫ�� 1. ������5-15���ַ� 2. 0���ܿ�ͷ 3. ���붼������ У��QQ�� 1. ��ȷ����ֵ����Boolean 2.
	 * ��ȷ�����б�String qq
	 */
	public static boolean checjQq(String qq) {
		boolean flag = true;
		if (qq.length() >= 5 && qq.length() <= 15) {
			if (!qq.startsWith("0")) {
				char arr[] = qq.toCharArray();
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] < '0' && arr[i] > '9') {
						flag = false;
						break;
					}
				}
			} else {

				flag = false;
			}
		} else {
			flag = false;
		}
		return flag;
	}

}

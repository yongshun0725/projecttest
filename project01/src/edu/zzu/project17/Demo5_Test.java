package edu.zzu.project17;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Demo5_Test {
/*
 * ���󣺽��������ظ�Ԫ��ȥȥ��
 * 
 * ������
 * 1.����List���ϴ洢����Ԫ��
 * 2.����ȥ������
 * 3.��ӡList����
 * */
	
	public static void main(String[] args) {
         ArrayList<String> list = new ArrayList<String>();
         list.add("a");
         list.add("a");
         list.add("a");
         list.add("b");
         list.add("b");
         list.add("c");
         list.add("c");
         list.add("d");
         list.add("d");
         
         getSingle(list);
         System.out.println(list);
	}

	private static void getSingle(List<String> list) {
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		hs.addAll(list);
		list.clear();
		list.addAll(hs);
	}

}

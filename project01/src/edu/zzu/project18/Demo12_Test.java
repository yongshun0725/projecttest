package edu.zzu.project18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class Demo12_Test {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		String[] num = {"3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "A", "2"};
		String[] color = { "����", "����", "��Ƭ", "÷��" };
		int index = 0;
		for (String s1 : num) {
			for (String s2 : color) {
				hm.put(index, s2.concat(s1));
				list.add(index);
				index++;
			}
		}
		hm.put(index, "С��");
		list.add(index);
		index++;
		hm.put(index, "����");
		list.add(index);
		Collections.shuffle(list);
		
		TreeSet<Integer> gaojin = new TreeSet<Integer>();
		TreeSet<Integer> longwu  = new TreeSet<Integer>();
		TreeSet<Integer> me = new TreeSet<Integer>();
		TreeSet<Integer> dipai = new TreeSet<Integer>();
		TreeSet<Integer> wo = me;
		for (int i = 0; i < list.size(); i++) {
			if (i >= list.size() - 3) {
				dipai.add(list.get(i));
			} else if (i % 3 == 0) {
				gaojin.add(list.get(i));
			} else if (i % 3 == 1) {
				longwu.add(list.get(i));
			} else {
				wo.add(list.get(i));
			}
		}
		System.out.print("�߽���");
        demo(hm, gaojin);
        System.out.print("\n���壺");
        demo(hm, longwu);
        System.out.print("\n�ҵģ�");
        demo(hm, wo);
        System.out.println("\n���ƣ�");
        demo(hm,dipai);
		/*for (int i = 0; i < poker.size(); i++) {
			
		}*/
	}

	private static void demo(HashMap<Integer, String> hm, TreeSet<Integer> gaojin) {
		for (Integer integer : gaojin) {
			System.out.print(hm.get(integer)+"  ");
		}
	}

}

package edu.zzu.project18;

import java.util.ArrayList;
import java.util.Collections;

public class Demo11_Test {

	public static void main(String[] args) {
		ArrayList<String> poker = new ArrayList<String>();
		String[] num = { "A", "2", "3", "3", "5", "6", "7", "8", "9", "10", "11", "12", "13" };
		String[] color = { "黑桃", "红桃", "方片", "梅花" };
		for (String s1 : color) {
			for (String s2 : num) {
				poker.add(s1.concat(s2));
			}
		}
		poker.add("小王");
		poker.add("大王");
		Collections.shuffle(poker);
		ArrayList<String> gaojin = new ArrayList<String>();
		ArrayList<String> zhangsan = new ArrayList<String>();
		ArrayList<String> me = new ArrayList<String>();
		ArrayList<String> dipai = new ArrayList<String>();

		for (int i = 0; i < poker.size(); i++) {
			if (i >= poker.size() - 3) {
				dipai.add(poker.get(i));
			} else if (i % 3 == 0) {
				gaojin.add(poker.get(i));
			} else if (i % 3 == 1) {
				zhangsan.add(poker.get(i));
			} else {
				me.add(poker.get(i));
			}
		}
		Collections.sort(me);
		System.out.println("gaojin: " + gaojin);
		System.out.println("zhangsan: " + zhangsan);
		System.out.println("me: " + me);
		System.out.println("红桃3".length());
	}

	public void sort(ArrayList<String> lsit) {
        
	}
}

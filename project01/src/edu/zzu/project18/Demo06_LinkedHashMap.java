package edu.zzu.project18;

import java.util.LinkedHashMap;

public class Demo06_LinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
		lhm.put("张三", 23);
		lhm.put("王五", 25);
		lhm.put("李四", 24);
		System.out.println(lhm);
	}

}

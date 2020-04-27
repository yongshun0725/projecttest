package edu.zzu.project18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import edu.zzu.project17.Stirng;

public class Demo02_Map {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
        map.put("张三", 20);
        map.put("李四", 21);
        map.put("王五", 22);
        Set<String> col = map.keySet();
        //demo2(map, col);
        //demo1(map);
        
	}

	private static void demo2(Map<String, Integer> map, Set<String> col) {
		Iterator<String> it = col.iterator();
        while(it.hasNext()) {
        	System.out.println(map.get(it.next()));
        }
	}

	private static void demo1(Map<String, Integer> map) {
		Set<String> col = map.keySet();
        for (String s : col) {
			System.out.println(map.get(s));
		}
	}

}

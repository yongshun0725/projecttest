package edu.zzu.project18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo03_Map {
/*
 * 根据键值对对象获取键和值
 * */
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
        map.put("张三", 20);
        map.put("李四", 21);
        map.put("王五", 22);
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        for(Map.Entry<String, Integer> m : set) {
        	System.out.println(m.getKey()+"  "+m.getValue());
        }
        //demo(set);
	}

	private static void demo(Set<Map.Entry<String, Integer>> set) {
		Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while(it.hasNext()) {
        	Map.Entry<String, Integer> en = it.next();
        	System.out.println(en.getKey()+"  "+en.getValue());
        }
	}

}

interface Inter{
	interface Inter2{
		public void show();
	}
}
class Demo implements Inter.Inter2{
	public void show() {
		
	}
}

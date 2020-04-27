package edu.zzu.project18;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo01_Map {

	public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 20);
        map.put("李四", 21);
        map.put("王五", 22);
        Set<String> a = map.keySet();
        Collection<Integer> arr = map.values();
        System.out.println(arr);
        System.out.println(map);
        System.out.println(map.get("张三"));
        System.out.println(map.containsKey("张三"));
        System.out.println(map.containsValue(22));
        
	}

}

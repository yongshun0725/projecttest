package edu.zzu.project18;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo01_Map {

	public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("����", 20);
        map.put("����", 21);
        map.put("����", 22);
        Set<String> a = map.keySet();
        Collection<Integer> arr = map.values();
        System.out.println(arr);
        System.out.println(map);
        System.out.println(map.get("����"));
        System.out.println(map.containsKey("����"));
        System.out.println(map.containsValue(22));
        
	}

}

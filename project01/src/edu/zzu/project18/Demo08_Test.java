package edu.zzu.project18;

import java.util.HashMap;
import java.util.Map;

public class Demo08_Test {

	public static void main(String[] args) {
       String str = "aaaaaaabbbbbbbccccccccddddddaaassdvsda";
       char[] ch = str.toCharArray();
       Map<Character, Integer> map = new HashMap<>();
       for(char c : ch) {
    	   map.put(c, !map.containsKey(c) ? 1 : map.get(c) + 1);
       }
       for(Character c : map.keySet()) {
    	   System.out.println(c+ " = " + map.get(c));
       }
	}

}

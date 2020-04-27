package edu.zzu.project17;

import java.util.HashSet;

public class Demo1_HashSet {
/**
 * 
 * @Title: main
 * @Description: 
 * @param args:Set集合无索引，不可重复
 * @author sys
 * @date 2020-02-22 08:48:41
 */
	public static void main(String[] args) {
      HashSet<String> hs = new HashSet<String>();
      hs.add("s");
      hs.add("a");
      hs.add("b");
      for(String s : hs) {
    	  System.out.println(s);
      }
      
	}

}

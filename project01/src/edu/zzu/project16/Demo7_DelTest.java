package edu.zzu.project16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Demo7_DelTest {

	public static void main(String[] args) {
		  ArrayList<String> a = new ArrayList<>();
	      a.add("a");
	      a.add("b");
	      a.add("c");
	      a.add("d");
	      a.add("e");
	      a.add("f");
//	      ListIterator<String> it = a.listIterator();
//	      while(it.hasNext()) {
//	    	  if("b".equals(it.next())) {
//	    		  it.add("cccccc");
//	    	  }
//	      }
//	      System.out.println(a);
	      for(String s : a) {
	    	  if(s.equals("b")) {
	    		  
	    	  }
	      }
	}

}

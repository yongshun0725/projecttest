package edu.zzu.project16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Demo6_Jdk5 {

	public static void main(String[] args) {
		  ArrayList<Person> arr = new ArrayList<Person>();
	      arr.add(new Person("����",24));
	      arr.add(new Person("����2",24));
	      arr.add(new Person("����3",24));
	      arr.add(new Person("����4",24));
	      arr.add(new Person("����",24));
	     
	      
	      ListIterator<Person> p = arr.listIterator();
	      while(p.hasNext()) {
	    	  if((new Person("����",24)).equals(p.next())) {
	    		  p.add(new Person("����",2600));
	    	  }
	    	 
	      }
	      System.out.println(arr);
	       /* *
		
	      ArrayList<String> a = new ArrayList<>();
	      a.add("a");
	      a.add("b");
	      a.add("c");
	      a.add("d");
	      a.add("e");
	      a.add("f");
	      ListIterator<String> lit = a.listIterator();
	      while(lit.hasNext()) {
	    	  
	    	  if("a".equals(lit.next())) {
	    		  lit.add("���");
	    	  }
	      }
	      System.out.println(a);
	      //*/
	}

}

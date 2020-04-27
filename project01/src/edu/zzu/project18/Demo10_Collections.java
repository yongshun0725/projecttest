package edu.zzu.project18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Demo10_Collections {
	
	public static void main(String[] args) {
         demo();
		//demo2();
		//demo3();  //·´×ª
	}

	private static void demo3() {
		ArrayList<String> arr = new ArrayList<String>();
        arr.add("a");
        arr.add("b");
        arr.add("c");
        arr.add("d");
        arr.add("a");
        Collections.reverse(arr);
        System.out.println(arr);
	}

	private static void demo2() {
		ArrayList<String> arr = new ArrayList<String>();
        arr.add("a");
        arr.add("b");
        arr.add("c");
        arr.add("d");
        arr.add("a");
       // System.out.println(Collections.binarySearch(arr, "a"));
        System.out.println(Collections.max(arr));
	}

	private static void demo() {
		ArrayList<String> arr = new ArrayList<String>();
          arr.add("a");
          arr.add("b");
          arr.add("c");
          arr.add("d");
          arr.add("a");
          System.out.println(arr);
          Collections.sort(arr);
          System.out.println(arr);
          Collections.shuffle(arr);
          System.out.println(arr);
	}
}

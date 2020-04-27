package edu.zzu.project16.homework;

import java.util.ArrayList;

public class Demo1_Homework {

	public static void main(String[] args) {
     ArrayList<Integer> arr= new ArrayList<Integer>();
     arr.add(0);
     arr.add(1);
     arr.add(2);
     arr.add(3);
     arr.add(4);
     //swap(10, 1, arr);
     revorse(arr);
     System.out.println(arr);
	}
public static <T> void swap(int first, int second, ArrayList<T> list) {
	if(first >= list.size() || second >= list.size()) {
		return;
	}
		T t = list.get(first);
		list.set(first, list.get(second));
		list.set(second, t);
	
	
  }
public static <T> void revorse(ArrayList<T> list) {
	for(int i = 0; i < list.size()/2; i++) {
		T t = list.get(i);
		list.set(i , list.get(list.size() - 1 - i));
		list.set(list.size() - 1 - i, t);
	}
}
}

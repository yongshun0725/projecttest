package edu.zzu.project15.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo9_Project {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("abce0fgh");
		list.add("ab2e0fgh");
		list.add("ab3e0fgh");
		list.add("ab5e0fgh");
		list.add("ab6e0fgh");
		list.add("ab5e0f8gh");
		list.add("000234ab5e0f8g9h");
		list.add("abc");
		list.add("def");
		list.add("ghi");
		
	}

	public static ArrayList<Integer> getRandomNum() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random random = new Random();
		while (list.size() < 10) {
			int num = random.nextInt(100) + 1;
			if (!list.contains(num)) {
				list.add(num);
			}
		}
		return list;
	}

	public static void ToSort(ArrayList<Integer> list) {
        Integer arr[] = list.toArray(new Integer[list.size()]);
		for(int i = 0; i < arr.length; i++) {
        	for(int a = 0; a < arr.length - i - 1; a++) {
        		if(arr[a] > arr[a+1]) {
        			int tmp = arr[a];
        			arr[a] = arr[a+1];
        			arr[a+1] = tmp;
        		}
        	}
        }
		for(int i = 0; i < list.size(); i++) {
			list.set(i, arr[i]);
		}
	}
}

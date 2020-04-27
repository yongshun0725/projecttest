package edu.zzu.project16.homework;

import java.util.LinkedList;

class Static<T>{

	private LinkedList<T> list = new LinkedList<>();
	public void in(T obj){
		list.addLast(obj);
	}
	public Object out() {
		return list.removeLast();
	}
	public boolean isEmpty() {
		return list.isEmpty();
	}
}
public class Test1{
	public static void main(String[] args) {
		Static<Integer> s = new Static<>();
		s.in(0);
		s.in(1);
		System.out.println(s.out());
		System.out.println(s.out());
		System.out.println(s.isEmpty());
		for (String string : args) {
			
		}
	}
}

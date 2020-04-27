package edu.zzu.project17;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo8_TreeSet {

	public static void main(String[] args) {
       TreeSet<Person> ts = new TreeSet<>(new CompareByLen());
       System.out.println();
	}

}
class CompareByLen implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return 0;
	}
	
}
package edu.zzu.project18;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo13_Genric {

	public static void main(String[] args) {
        TreeSet<Student> tree = new TreeSet<Student>(new Comp());
        tree.add(new Student("����",33));
        tree.add(new Student("����",44)); 
        tree.add(new Student("����",55));
        tree.add(new Student("����",66));
        System.out.println(tree);
	}

}
class Comp implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		int num = o1.getAge() - o2.getAge();
		return num == 0 ? o1.getName().compareTo(o2.getName()) : num;
	}
	
}
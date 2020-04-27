package edu.zzu.project15;

import java.util.ArrayList;
import java.util.List;

import edu.zzu.project15.bean.Student;

public class Demo7_List_Student {

	public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Student("张三",20));
        list.add(new Student("张三2",20));
        System.out.println(list);
        
	}

}

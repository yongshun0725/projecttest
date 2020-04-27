package edu.zzu.project27;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Demo04_Field {

	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("edu.zzu.project27.Person");
        Constructor c = clazz.getConstructor(String.class , int.class);
        Person p = (Person)c.newInstance("张三",23);
        
//        Field f = clazz.getField("name");
//        f.set(p, "历史");
        Field f = clazz.getDeclaredField("name");
        f.setAccessible(true);
        f.set(p, "李四");
        System.out.println(p);
	}

}

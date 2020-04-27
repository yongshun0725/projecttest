package edu.zzu.project27;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Demo04_Field {

	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("edu.zzu.project27.Person");
        Constructor c = clazz.getConstructor(String.class , int.class);
        Person p = (Person)c.newInstance("����",23);
        
//        Field f = clazz.getField("name");
//        f.set(p, "��ʷ");
        Field f = clazz.getDeclaredField("name");
        f.setAccessible(true);
        f.set(p, "����");
        System.out.println(p);
	}

}

package edu.zzu.project27;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Demo05_Method {

	public static void main(String[] args) throws Exception{
		Class clazz = Class.forName("edu.zzu.project27.Person");
        Constructor c = clazz.getConstructor(String.class , int.class);
        Person p = (Person)c.newInstance("уехЩ",23);
        
        Method m = clazz.getMethod("eat");
        m.invoke(p);
        
        Method m2 = clazz.getMethod("eat", int.class);
        m2.invoke(p, 10);
	}

}


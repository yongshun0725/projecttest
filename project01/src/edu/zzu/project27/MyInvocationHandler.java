package edu.zzu.project27;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
	private Object target;
	
	public MyInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("Ȩ��У��");
		method.invoke(target, args);
		System.out.println("��־��¼");
		return null;

	}

}

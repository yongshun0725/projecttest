package edu.zzu.project27;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Scanner;

public class DeMo08_Test {

	public static void main(String[] args) throws Exception{
//      UserImp ui = new UserImp();
//      ui.add();
//      ui.delet();
//      System.out.println("--------------------------");
//      MyInvocationHandler mi = new MyInvocationHandler(ui);
//      User u = (User) Proxy.newProxyInstance(ui.getClass().getClassLoader(), ui.getClass().getInterfaces(), mi);
//      u.add();
//      u.delet();
		//((UserImp)null).test();
		ArrayList<String> list = new ArrayList<>();
		System.out.println("请输入一句话：");
		Scanner sc = new Scanner(System.in);
		String str;
		
		while(sc.hasNext()) {
			str = sc.nextLine();
			if(str.length() == 0) {
				System.out.println("0000000000000");
				break;
			}
			list.add(str);
		}
		System.out.println("list保存的有："+list);
	}

}

interface User{
	public void add();
	public void delet();
}

 class UserImp implements User{

	@Override
	public void add() {
		System.out.println("+++++");
	}

	@Override
	public void delet() {
		System.out.println("---");
	}
	public static void test() {
		System.out.println("54444444444");
	}
}
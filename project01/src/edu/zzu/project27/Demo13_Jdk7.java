package edu.zzu.project27;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

interface Comarator<T> {
	public T compare(T x, T y);
}

public class Demo13_Jdk7 {

	/**
	 * 
	 * @param args jdk1.7新特性 二进制字面
	 */
	public static void main(String[] args) {
		System.out.println(test("abcdefg",3));
	}

	public static String test(String str,int n) {	
		String tmp = str.substring(0, n);
		String resstr = "";
		for (int i = n; i < str.length(); i++) {
			resstr+=str.charAt(i);
			
		}
		resstr += tmp;
		return resstr;
	}

	public static ArrayList<ArrayList<Integer>> getSubLists(ArrayList<Integer> list, int index) {
		ArrayList<ArrayList<Integer>> subLists;
		if (index == list.size()) {
			subLists = new ArrayList<ArrayList<Integer>>();
			subLists.add(new ArrayList<Integer>());
		} else {
			subLists = getSubLists(list, index + 1);
			Integer element = list.get(index);
			ArrayList<ArrayList<Integer>> currentLists = new ArrayList<ArrayList<Integer>>();
			for (ArrayList<Integer> sublist : subLists) {
				ArrayList<Integer> tempList = new ArrayList<Integer>();
				tempList.addAll(sublist);
				tempList.add(element);
				currentLists.add(tempList);
			}
			subLists.addAll(currentLists);
		}
		return subLists;

	}

	public static void telent() throws Exception {
		Socket socket = new Socket("127.0.0.1", 9999);
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		PrintStream ps = new PrintStream(os);
		ps.println();
	}

	public static void server() throws Exception {
		ServerSocket server = new ServerSocket(9999);
		Socket socket = server.accept();
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();

		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		PrintStream ps = new PrintStream(os);

	}

	private static void demo1() {
		System.out.println(0b110);
		System.out.println(1000_000);
	}

}

/**
 * jdk1.8新特性：接口中方法可以有方法体，如果非静态方法，必须使用default修饰，静态不需要
 */
interface Inter {

	public default void print() {
		System.out.println("Hello Word!!");
	}

	public static void method() {
		System.out.println("static method");
	}
}

class Demo implements Inter {
	public void run() {
		class Inner {
			public void fun() {
				System.out.println("fun");
			}
		}
		Inner i = new Inner();
		i.fun();
	}
}

package edu.zzu.project16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo9_AsList {
/**
 * 
 * @Title: main
 * @Description: 数组转集合
 * @param args
 * @author sys
 * @date 2020-02-22 12:11:46
 */
	public static void main(String[] args) {
          //demo1();
		  //demo2();
		List<String> list = new ArrayList<String>();
		list.add("00");
		list.add("001");
		String[] arr = list.toArray(new String[0]);
		System.out.println(arr[0]);
	}

private static void demo2() {
	Integer[] arr = {11,22,3,44};
	List<Integer> list = Arrays.asList(arr);
	System.out.println(list);
}

private static void demo1() {
	String[] arr = {"aa","bb","cc"};
	  List<String> list = Arrays.asList(arr);
	  //list.add("ff");                      
	  /*数组转集合不能使用添加，但可以使用集合的其他方法
	                 比如判断元素是否成存在
	    */                                   
	  System.out.println(list);
}

}

package edu.zzu.project17;

import java.util.TreeSet;

public class Demo6_TreeSet {
/**
 * 
 * @Title: main
 * @Description: 
 * @param args
 * @author sys
 * @date 2020-02-24 05:05:22
 */
	public static void main(String[] args) {
		/*
		 * TreeSet��������Ԫ�������ұ�֤Ԫ��Ψһ
		 * */
       TreeSet<Integer> tree = new TreeSet<Integer>();
       tree.add(4);
       tree.add(1);
       tree.add(2);
       tree.add(3);
       tree.add(2);
       System.out.println(tree);
	}

}

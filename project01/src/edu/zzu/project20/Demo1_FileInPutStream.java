package edu.zzu.project20;


import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Demo1_FileInPutStream {

	public static void main(String[] args) throws IOException {
//        FileInputStream fis = new FileInputStream(new File("yyy.txt"));
//        char x = (char)fis.read();
//        System.out.println(x);
//        char x2 = (char)fis.read();
//        System.out.println(x2);
//        int x3 = fis.read();
//        System.out.println(x3);
        
	   // fis.close();
//	List<Integer> list  = new ArrayList<Integer>();
//	list.add(111);
//	list.add(222);
//	list.add(333);
//	list = Collections.unmodifiableList(list);
//	list.add(22222);
//	Iterator<Integer> i = list.iterator();
//	while(i.hasNext()) {
//		int a = i.next();
//		if(a == 222) {
//			i.remove();
//		}
//	}
//	System.out.println(list);
		Scanner sc = new Scanner(System.in);
		System.out.println(212212121);
		do {
		  String str = sc.nextLine();
		  String[] aa = str.split(" ");
		  System.out.println(aa[0]+"  "+aa[1]);
		  if(str.equals(""))
			  break;
		}while(true);
		
		System.out.println(151);
	}

}

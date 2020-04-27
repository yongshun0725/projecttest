package edu.zzu.project14;

import java.util.Random;

public class Demo5_Random {

	public static void main(String[] args) {
		Random r = new Random();
		int i = 0;
//		while(true) {
//			i++;
//			if (r.nextInt(1) == 1) {
//				
//				System.out.println("yes");
//				break;
//			}
//		}
		System.out.println(r.nextInt(50));
	}

}

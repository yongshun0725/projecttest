package edu.zzu.project17;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;

public class Demo3_Test {

	public static void main(String[] args) {
        HashSet<Integer> hs = new LinkedHashSet<Integer>();
        while(hs.size()<10) {
        	Random ran = new Random();
        	int num = ran.nextInt(19) + 1;
        	hs.add(num);
        }
        for (Integer integer : hs) {
			System.out.print(integer+"  ");
		}
	}

}

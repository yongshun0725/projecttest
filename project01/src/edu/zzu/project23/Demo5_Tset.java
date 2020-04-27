package edu.zzu.project23;

import java.math.BigInteger;

public class Demo5_Tset {

	public static void main(String[] args) {
      
		StringBuffer s = new StringBuffer();
       BigInteger bi = new BigInteger("1");
       for(int i = 1; i<=1000; i++){
    	  BigInteger bi2 = new BigInteger(i+"");
    	  bi = bi.multiply(bi2);
       }
       String str= bi.toString();
       int count = 0;
		/*
		 * for(int i = 0; i < str.length(); i++) { if('0' == str.charAt(i)) { count++; }
		 * }
		 */
       for(int i= str.length()-1; i >= 0; i--) {
    	   if('0'!=str.charAt(i)) {
    		   break;
    	   }
    	   count ++;
       }
       System.out.println(count);
	}
    
}


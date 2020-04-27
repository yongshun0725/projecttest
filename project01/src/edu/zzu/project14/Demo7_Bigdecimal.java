package edu.zzu.project14;

import java.math.BigDecimal;

public class Demo7_Bigdecimal {

	public static void main(String[] args) {
		BigDecimal b1 = new BigDecimal("2.0");
		BigDecimal b2 = new BigDecimal("1.1");
		System.out.println(b1.subtract(b2));
		BigDecimal b3 = BigDecimal.valueOf(2.0);
		BigDecimal b4 = BigDecimal.valueOf(1.1);
		System.out.println(b3.subtract(b4));
	}

}

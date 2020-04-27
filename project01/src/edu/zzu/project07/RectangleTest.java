package edu.zzu.project07;

import java.util.Scanner;

public class RectangleTest {
	/*
	@author xxx
	@version v1.0
	*/
    public static void main(String []args) {
//	    Rectangle rec = new Rectangle(10, 5);
	    Scanner sc = new Scanner(System.in);
	    System.out.println("QING HS");
	    
	    int num = (int)(Math.random()*100);
	    while(true) {
	    	int nu = sc.nextInt();
	    	if(nu>num) {
	    		System.out.println("大了");
	    	}else if(nu<num){
	    		System.out.println("小 了");
	    	}else {
	    		System.out.println("对了");
	    		break;
	    	}
	    }
 }
}

//class Rectangle{
//	   private int width;
//	   private int high;
//		public int getWidth() {
//			return width;
//		}
//		public void setWidth(int width) {
//			this.width = width;
//		}
//		public int getHigh() {
//			return high;
//		}
//		public void setHigh(int high) {
//			this.high = high;
//		}
//		public Rectangle() {
//			
//		}
//		public Rectangle(int width,int high) {
//			this.width = width;
//			this.high = high;
//		}
//	   public int getLength() {
//		   return 2*(this.width + this.high);
//	   }
//	   public int getArea() {
//		   return width*high;
//	   }
//}
package edu.zzu.project19;

import java.io.FileInputStream;

public class Demo04_Exception {
    //����ʱ�쳣
	public static void main(String[] args) {
      try {
    	  FileInputStream fis = new FileInputStream("xxx.txt");
      }catch(Exception e) {
    	  System.out.println(e);
      }
	}

}

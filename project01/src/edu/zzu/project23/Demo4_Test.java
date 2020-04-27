package edu.zzu.project23;

import java.io.File;

public class Demo4_Test {
    /**
     * 
     * @param args   
     *
     *分析：
     *   1.获取所有文件或文件夹
     *   2.遍历数组
     *   3.无论是文件还是文件夹都需要打印
     *   4.如果是文件夹递归
     */
	
	public static void main(String[] args) {
        File dir = Demo1_Test.getFile();
        printLev(dir,0);
        
	}

	private static void printLev(File dir,int num) {
		File[] subFiles = dir.listFiles(); 
		
		for (File file : subFiles) {
			for(int i = 0; i < num; i++) {
				System.out.print("\t");
			}
			System.out.println(file.getName());
			if(file.isDirectory()) {
				printLev(file,num+1);
			}
		}
	}

}


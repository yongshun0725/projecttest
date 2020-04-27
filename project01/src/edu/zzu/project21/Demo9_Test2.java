package edu.zzu.project21;

import java.io.File;
import java.util.Scanner;

public class Demo9_Test2 {
  
	/**
     * @param args
     * 
     * 从键盘接收一个文件夹路径，打印出所有.java文件
     * 
     * 分析
     * 1.如果录入的不存在，给与提示
     * 2.如录入的是文件，给与提示
     * 3.如果录入的是文件夹，给与返回
     * 
     * 打印出该文件夹下所有.java文件
     * 1.获取该路径下所有文件和文件夹，存储在File数组中
     * 2.遍历数组，对每个文件或文件夹做出判断
     * 3.如果是文件且后缀是.java，打印
     * 4.如果是文件夹，递归
     */
	public static void main(String[] args) {
         printJavaFile(getFile());
	}
   /**
    * 获取录入的文件夹路径
    * 1.返回值File
    * 2.无参数
    */
	public static File getFile() {
		System.out.println("请输入一个文件夹路径：");
		Scanner sc = new Scanner(System.in);
		while(true) {
			String line = sc.nextLine();
			File dir = new File(line);
			if(!dir.exists()) {
				System.out.println("输入路径不存在，请重新输入！");
			}else if(dir.isFile()) {
				System.out.println("您录入的是文件，请重新录入文件夹路径！");
			}else {
				return dir;
			}
		}
	}
	
	/*
	 * 获取文件夹下所有路径
	 * 1.返回值void
	 * 2.参数列表File file
	 */
	
	public static void printJavaFile(File file) {
		File[] list = file.listFiles();
		for (File file2 : list) {
			if(file2.isFile() && file2.getName().endsWith(".java")) {
				System.out.println(file2.getName());
			}else if(file.isDirectory()){
				printJavaFile(file2);
			}
		}
	}
}


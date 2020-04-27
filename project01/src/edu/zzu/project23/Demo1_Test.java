package edu.zzu.project23;

import java.io.File;
import java.util.Scanner;

public class Demo1_Test {
    /**
     * @param args   
     *
     * 从键盘 接受一个路径，判断文件夹大小
     * 
     * 分析：
     * 需求1.从键盘接受一个文件路径
     *   1.创建键盘录入对象
     *   2.定义一个无限循环
     *   3.将键盘录入结果保存并封装为File对象
     *   4.对File对象判断
     *   5.将文件夹路径返回
     * 
     * 需求2：统计文件夹大小
     *    1.定义一个求和变量
     *    2.获取该文件夹下所有listFiles()
     *    3.遍历数组
     *    4.判断是文件就累加
     *    5.判断是会文件夹就递归
     */
	public static void main(String[] args) {
          System.out.println(getSize(getFile()));
	}

	/**
	 * 从键盘接受一个文件夹路径
	 * 1.返回值File
	 * 2.参数列表无
	 */
	public static File getFile() {
		//1.创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个路径：");
		//2.定义一个无限循环
        while(true) {
        	//将键盘录入结果保存并封装为File对象
        	String line = sc.nextLine();
        	File file = new File(line);
        	//对File对象判断
        	if(!file.exists()) {
        		System.out.println("你输入的路径不存在！");
        	}else if(file.isFile()){
        		System.out.println("你输入的是文件路径！");
        	}else {
        		return file;
        	}
        }
	}
	
	/**
	 * 统计文件夹大小
	 * 1.返回值long
	 * 2.参数列表File 
	 */
	public static long getSize(File file) {
		//1.定义一个求和变量
		long len = 0;
		
        //2.获取该文件夹下所有listFiles()
		File[] subFiles = file.listFiles();
		//3.遍历数组
		for (File subFile : subFiles) {
			//4.判断文件累加
			if(subFile.isFile()) {
				len = len + subFile.length();
			}else {
				len = len + getSize(subFile);
			}
		}
		return len;
	}
}


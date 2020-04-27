package edu.zzu.project23;

import java.io.File;

public class Demo2_Test {
    /**
     * 
     * @param args   
     *
     *需求：从键盘接收一个文佳佳，删除该文件夹
     *
     *分析：
     *  1.获取该文件夹下所有文件和文件夹
     *  
     */
	public static void main(String[] args) {
          delFile(Demo1_Test.getFile());
	}
    /**
     * 删除该文件夹
     * 1.返回值为void
     * 2.参数列表File
     */
	public static void delFile(File dir) {
		File[] subFiles = dir.listFiles();
		for (File file : subFiles) {
			if(file.isFile()) {
				file.delete();
			}else {
				delFile(file);
			}
		}
		dir.delete();
	}
}


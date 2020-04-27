package edu.zzu.project23;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3_Test {
	/**
	 * 
	 * @param args   
	 *
	 * 文件拷贝
	 * 
	 * 分析：
	 * 1.在目标文件夹创建原文件夹
	 * 2.获取原文件夹中所有文件和文件夹，存储在File数组中
	 * 3.遍历数组
	 * 4.如果是文件使用io流读写
	 * 5.文件夹递归调用
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
        File file1 = Demo1_Test.getFile();
        File file2 = Demo1_Test.getFile();
        if(!file1.equals(file2)) {
        	
        }
        copy(file1,file2);
	}
    /**
     * 拷贝
     * 1.返回值类型void
     * 2.参数列表File src File dest
     * @throws IOException 
     */
	public static void copy(File src, File dest) throws IOException {
		File newDir = new File(dest,src.getName());
		newDir.mkdir();
		File[] subFiles = src.listFiles();
		for (File file : subFiles) {
			if(file.isFile()) {
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
				BufferedOutputStream bos = 
						new BufferedOutputStream(new FileOutputStream(new File(newDir,file.getName())));
				int b;
				while((b = bis.read()) != -1) {
					bos.write(b);
				}
				bis.close();
				bos.close();
			}else {
				copy(file, newDir);
			}
		}
	}
}


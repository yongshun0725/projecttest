package edu.zzu.project19;

import java.io.File;

public class Demo12_File {
    /*
     * A：重命名和删除
     *    renameTo(File file):把文件重命名到指定路径
     *    delete():删除文件或文件夹
     * */
	public static void main(String[] args) {
           //demo1();
		   //demo2();
		File file3 = new File("aaa");
		System.out.println(file3.delete());
	}
   //删除文件
	private static void demo2() {
		File file = new File("ooo.txt");
		System.out.println(file.delete());
	}
   //重命名文件
	private static void demo1() {
		File file = new File("yyy.txt");
           File refile = new File("ooo.txt");
           System.out.println(file.renameTo(refile));
	}

}

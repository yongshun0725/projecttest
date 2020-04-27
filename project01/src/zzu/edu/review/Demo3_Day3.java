package zzu.edu.review;

import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo3_Day3 {

	public static void main(String[] args) {
      //demo1();
      //demo2();
		//demo3();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sdf.setLenient(false);
		String filename = sdf.format(new Date()) + "file.txt";
		File file = new File("./"+ filename);
		if(file.exists()) {
			System.out.println("文件存在");
		}else {
			try {
				file.createNewFile();
				System.out.println("创建成功");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		try {
			FileWriter fw = new FileWriter(file);
			fw.write("2121332213");
			fw.flush();
			fw.close();
			System.out.println("成功");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	private static void demo3() {
		int x = 2;
		int y = 3;
		switch(x){
			default:
				y++;
			case 3:
				y++;
			case 4:
				y++;
		}
		System.out.println("y="+y);
	}
    /**
     * 
     * @Title: demo1
     * @Description: 异或两次，不变
     * @author sys
     * @date 2020-02-22 03:12:47
     */
	private static void demo1() {
		int a = 10;
		int b = 5;
		int c = a^b;
		b = c^b;
		a = c^b;
		System.out.println("a = "+a+"  b = "+b);
	}
	/*
	 * >>,>>>,<<的用法:
	 * */
	
	private static void demo2() {
		int a = 4<<3;
		System.out.println(a);
	}
}

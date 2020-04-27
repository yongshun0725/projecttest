package edu.zzu.project21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Demo6_resorce {
    /**
     * 
     * @param args
           * 将一个文本文档反转，第一行和倒数第一行换
     * 1.创建输入输出流对象
     * 2.保存进集合
     * 4.倒着读取数据写到文件上
     * 5.关流
     */
	public static void main(String[] args) throws IOException{
           BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
           BufferedWriter bw = new BufferedWriter(new FileWriter("yyy.txt"));
           ArrayList<String> list = new ArrayList<String>();
           String line;
           while((line = br.readLine()) != null) {
        	   list.add(line);
           }
           Collections.reverse(list);
           for (String string : list) {
			bw.write(string);
			bw.newLine();
		}
           br.close();
           bw.close();
	} 

}


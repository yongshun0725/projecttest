package edu.zzu.project21;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

public class Demo8_Test {
    /*
     * 获取一个文本，输出每个字符串出现字数，将结果写在test.txt
     * 
     * 分析：   
     * 1.创建带缓冲输入流的对象
     * 2.创建双列集合TreeMap
     * 3.将读到的字符存储在双链集合中，存储时要判断，该字符是否存在
     * 4.关闭输入流
     * 5.创建输出流对象
     * 6.遍历集合将结果写入
     * 7.关闭输出流
     * */
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
        TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
        int c;
        while((c = br.read()) != -1) {
        	char ch = (char)c;
        	map.put(ch, map.containsKey(ch) ? map.get(ch)+1 : 1);
        }
        br.close();
        
        BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
        for(Character key : map.keySet()) {
        	switch(key) {
        	   case '\t':
        		   bw.write("\\t" + " = " + map.get(key));
        		   break;
        	   case '\n':
        		   bw.write("\\n" + " = " + map.get(key));
        		   break;
        	   case '\r':
        		   bw.write("\\r" + " = " + map.get(key));
        		   break;
        	   default:
        		   bw.write(key + " = " + map.get(key));
        		   break;
        	}
        	
        	bw.newLine();
        }
        bw.close();
	}

}


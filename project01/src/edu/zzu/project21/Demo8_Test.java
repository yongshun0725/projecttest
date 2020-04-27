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
     * ��ȡһ���ı������ÿ���ַ������������������д��test.txt
     * 
     * ������   
     * 1.�����������������Ķ���
     * 2.����˫�м���TreeMap
     * 3.���������ַ��洢��˫�������У��洢ʱҪ�жϣ����ַ��Ƿ����
     * 4.�ر�������
     * 5.�������������
     * 6.�������Ͻ����д��
     * 7.�ر������
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


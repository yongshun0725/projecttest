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
           * ��һ���ı��ĵ���ת����һ�к͵�����һ�л�
     * 1.�����������������
     * 2.���������
     * 4.���Ŷ�ȡ����д���ļ���
     * 5.����
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


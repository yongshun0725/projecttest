package edu.zzu.project20;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3_FileOutPutStream {

	public static void main(String[] args) throws IOException {
       FileOutputStream fos = new FileOutputStream("yyy.txt");   //�����ֽ����������������ڣ��Զ�����
       fos.write(97);    // ��Ȼд���������֣������ļ����Զ�ȥ��ǰ3���ֽ�
       fos.write(98);
	}

}

package edu.zzu.project18;

import java.util.HashMap;

public class Demo09_Test {

	public static void main(String[] args) {
       HashMap<Student, String> hm88 = new HashMap<Student, String>();
       hm88.put(new Student("����",23), "����");
       hm88.put(new Student("����",23), "����");
       hm88.put(new Student("����",23), "����");
       hm88.put(new Student("����",23), "֣��");
       hm88.put(new Student("����",23), "����");
       
       HashMap<Student, String> hm99 = new HashMap<Student, String>();
       hm99.put(new Student("�����",888), "����");
       hm99.put(new Student("��˽�",666), "����");
       hm99.put(new Student("ɳ����",555), "����");
       hm99.put(new Student("������",996), "֣��");
       hm99.put(new Student("������",1024), "����");
       
       HashMap<HashMap<Student, String>, String> hm = new HashMap<HashMap<Student,String>, String>();
       hm.put(hm88, "88�ڰ�");
       hm.put(hm99, "99�ڰ�");
       for(HashMap<Student, String> hmp : hm.keySet()) {
    	   for(Student s : hmp.keySet()) {
    		   System.out.println(s +"  " + hmp.get(s) + "   " + hm.get(hmp));
    	   }
       }
	}

}

package edu.zzu.project18;

import java.util.HashMap;

public class Demo09_Test {

	public static void main(String[] args) {
       HashMap<Student, String> hm88 = new HashMap<Student, String>();
       hm88.put(new Student("张三",23), "商丘");
       hm88.put(new Student("李四",23), "洛阳");
       hm88.put(new Student("王五",23), "南阳");
       hm88.put(new Student("赵六",23), "郑州");
       hm88.put(new Student("孙七",23), "苏州");
       
       HashMap<Student, String> hm99 = new HashMap<Student, String>();
       hm99.put(new Student("孙悟空",888), "商丘");
       hm99.put(new Student("猪八戒",666), "洛阳");
       hm99.put(new Student("沙和尚",555), "南阳");
       hm99.put(new Student("白龙马",996), "郑州");
       hm99.put(new Student("唐三藏",1024), "苏州");
       
       HashMap<HashMap<Student, String>, String> hm = new HashMap<HashMap<Student,String>, String>();
       hm.put(hm88, "88期班");
       hm.put(hm99, "99期班");
       for(HashMap<Student, String> hmp : hm.keySet()) {
    	   for(Student s : hmp.keySet()) {
    		   System.out.println(s +"  " + hmp.get(s) + "   " + hm.get(hmp));
    	   }
       }
	}

}

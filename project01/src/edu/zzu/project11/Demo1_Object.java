package edu.zzu.project11;

public class Demo1_Object {

	public static void main(String[] args) {
      Object ob = new Object();
      int i = ob.hashCode();
      //System.out.println(i);
      Person_Test p1 = new Person_Test("�˵�","�°�",15);
      Person_Test p2 = new Person_Test("�˵�","�°�",16);
      Person_Test p3 = p1;
      System.out.println(p1.equals(p2));
      //System.out.println(p1.getClass().getName());
      //System.out.println(p2.hashCode());
      //System.out.println(p1.toString());
	}
/*
 * ==��equals�ıȽϣ�
 *  ��ͬ�㣺���������Ƚϣ�����ֵ��Ϊboolean
 *  ����1��==���ǱȽ���������ȿ��ԱȽϻ����������ͣ�Ҳ���ԱȽ������������ͣ������������ͱȽ���ֵ�������������ͱȽϵ��ǵ�ַ
 *      2��equals����ֻ�ܱȽ������������ͣ�equalsû����д֮ǰ�ǱȽϵ�ַ���൱��==�����ǱȽϵ�ַ��û�������
 */
}

class Person_Test {
	private String name;
	private String id;
	private int gz;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getGz() {
		return gz;
	}

	public void setGz(int gz) {
		this.gz = gz;
	}

	public Person_Test() {

	}
	public Person_Test(String name,String id, int gz) {
           this.name = name;
           this.id = id;
           this.gz = gz;
	}

	@Override
	public String toString() {
		return "Person_Test [name=" + name + ", id=" + id + ", gz=" + gz + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Person_Test p = (Person_Test)obj;
		return this.name.equals(p.name)&&this.id.equals(p.id)&&this.gz == p.gz;
	}

//	@Override
//	public String toString() {
//		return "�ҵ������ǣ�"+name;
//	}
//	public boolean equals(Person_Test person) {
//		if(this.getName() == person.getName() && this.id == person.id && this.gz == person.gz) {
//			return true;
//		}else {
//			return false;
//		}
//	}
	
}
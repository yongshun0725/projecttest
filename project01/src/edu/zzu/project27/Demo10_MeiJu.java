package edu.zzu.project27;


public class Demo10_MeiJu {

	public static void main(String[] args) {
		/*
		 * Week mod = Week.MON; Week tue = Week.TUE; Week wed = Week.WED;
		 
        Week2 w = Week2.MON;
        System.out.println(w.getName());
        */
		
		Week3 w3= Week3.MON;
		w3.show();
	}

}
/**
 * 
 * @ClassName: Week
 * @Description: ö�ٵ�һ��
 * @author sys
 * @date 2020-03-08 01:43:35
 */
class Week{
	public static final Week MON = new Week();
	public static final Week TUE= new Week();
	public static final Week WED = new Week();
	private Week() {}
	
}

/**
 * 
 * @ClassName: Week2
 * @Description: ö�ٵڶ���
 * @author sys
 * @date 2020-03-08 01:43:56
 */
class Week2{
	public static final Week2 MON = new Week2("����һ");
	public static final Week2 TUE= new Week2("���ڶ�");
	public static final Week2 WED = new Week2("������");
	private String name;
	private Week2(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
}

/**
 * ö�ٵ�����
 */
abstract class Week3{
	public static final Week3 MON = new Week3("����һ") {
		@Override
		public void show() {
			System.out.println("����һ");
		}
	};
	public static final Week3 TUE= new Week3("���ڶ�"){
		@Override
		public void show() {
			System.out.println("���ڶ�");
		}
	};
	public static final Week3 WED = new Week3("������"){
		@Override
		public void show() {
			System.out.println("������");
		}
	};
	private String name;
	private Week3(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public abstract void show();
}





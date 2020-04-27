package edu.zzu.project27;


public class Demo11_MeiJu {

	public static void main(String[] args) {
//       Week4 w4 = Week4.MON;
//       System.out.println(w4);
//		Week5 w5 = Week5.MON;
//		System.out.println(w5.getName());
		Week6 w6 = Week6.MON;
		w6.show();
	}

}

enum Week4{
	MON,TUE,WED;
}

enum Week5{
	MON("����һ"),TUE("���ڶ�"),WED("������");
	private String name;
	private Week5(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return name;
	}
}
enum Week6{
	MON("����һ"){
		@Override
		public void show() {
			System.out.println("����1");
		}
	},TUE("���ڶ�"){
		@Override
		public void show() {
			System.out.println("����2");
		}
	},WED("������"){
		@Override
		public void show() {
			System.out.println("����3");
		}
	};
	private String name;
	private Week6(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public abstract void show();
}
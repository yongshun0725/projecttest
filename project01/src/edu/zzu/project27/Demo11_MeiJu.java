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
	MON("星期一"),TUE("星期二"),WED("星期三");
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
	MON("星期一"){
		@Override
		public void show() {
			System.out.println("星期1");
		}
	},TUE("星期二"){
		@Override
		public void show() {
			System.out.println("星期2");
		}
	},WED("星期三"){
		@Override
		public void show() {
			System.out.println("星期3");
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
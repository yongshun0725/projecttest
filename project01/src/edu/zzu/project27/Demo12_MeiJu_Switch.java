package edu.zzu.project27;

public class Demo12_MeiJu_Switch {
	public static void main(String[] args) {
          //demo1();
		Week5 mon = Week5.valueOf(Week5.class,"MON");
		System.out.println(mon);
	}

	private static void demo1() {
		  Week5 mon = Week5.MON;
          Week5 tue = Week5.TUE;
          /*System.out.println(mon.ordinal());
          System.out.println(tue.ordinal());
          
          System.out.println(mon.compareTo(tue));*/
          System.out.println(mon.name());
          System.out.println(mon.toString());
	}
}

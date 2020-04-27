package edu.zzu.project19;

public class Demo07_Finally {

	public static void main(String[] args) {
      try {
    	  System.out.println(1/0);;
      }catch(Exception e) {
    	  System.out.println("³ıÊıÎª0ÁË");
    	  System.exit(0);
      }finally {
    	  System.out.println("Äã³òÉ¶");
      }
	}

}

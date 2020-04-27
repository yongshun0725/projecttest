package edu.zzu.project13;

public class Demo4_test {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
          String str = arrayToString(arr);
          System.out.println(str);
	}

	public static String arrayToString(int[] arr) {
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for(int i = 0; i < arr.length; i++) {
        	if(i == arr.length-1) {
        		sb.append(arr[i]+"]");
        	}else {
        		sb.append(arr[i]+", ");
        	}
        }
		return sb.toString();
	}
}

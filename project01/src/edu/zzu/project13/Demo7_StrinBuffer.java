package edu.zzu.project13;

public class Demo7_StrinBuffer {
	/*
	 * String ��Ϊ�������� StringBuilder��Ϊ��������
	 */
	public static void main(String[] args) {
		int i = 8;
		System.out.println(i>>2);
	}
    public static void bubbleSort(int arr[]){
    	for(int i = 0; i < arr.length-1; i++) {
    		for(int j = 0; j < arr.length-i-1; j++) {
    			if(arr[j] > arr[j+1]) {
    				int tmp = arr[j];
    				arr[j] = arr[j+1];
    				arr[j+1] = tmp;
    			}
    		}
    	}
    	for(int i = 0;i<arr.length;i++) {
    		System.out.println(arr[i]);
    	}
    }
	public static void selectSort(int arr[]) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	/*
	 * ��λ������
	 * 1.����ֵ���ͣ�void
	 * 2.�����б�int[] arr , int i ,int j
	 */
	
}

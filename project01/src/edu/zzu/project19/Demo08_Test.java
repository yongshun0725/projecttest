package edu.zzu.project19;

public class Demo08_Test {

	/*
	 * A��������1
	     *final,finally,finalize
	     * final���������࣬���ܱ��̳�
	     * final�������η��������ܱ���д
	     * final�������α�����ֻ�ܸ�ֵһ��
	     * 
	     * finally��try����һ������壬���ܵ���ʹ�ã������ͷ���Դ
	     * 
	     * finalize��һ��������������������ȷ�������ڶԸö���ĸ�������ʱ���ɶ�����������������ô˷���
	     * 
	  * B:������2
	           * ���catch�������return��䣬finally���뻹��ִ��������ᣬ��return֮ǰ����֮��
	 * */
	public static void main(String[] args) {
          System.out.println(test());
	}
	public static int test() {
		int n = 10;
		try {
			n = 20;
			System.out.println(1/0);
			return n;
		}catch(Exception e) {
			n = 30;
			return n;
		}finally {
			n = 40;
		}
	}

}


class AgeOutofException extends RuntimeException{

	/**  
	 * @Fields serialVersionUID : TODO(����)
	 * @author sys
	 * @date 2020-02-26 12:02:21 
	 */ 
	private static final long serialVersionUID = 1L;

	public AgeOutofException() {
		
	}

	public AgeOutofException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public AgeOutofException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public AgeOutofException(String message) {
		super(message);
		
	}

	public AgeOutofException(Throwable cause) {
		super(cause);
		
	}
	
}
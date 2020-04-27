package edu.zzu.project19;

public class Demo08_Test {

	/*
	 * A：面试题1
	     *final,finally,finalize
	     * final可以修饰类，不能被继承
	     * final可以修饰方法，不能被重写
	     * final可以修饰变量，只能赋值一次
	     * 
	     * finally是try语句的一个语句体，不能单独使用，用来释放资源
	     * 
	     * finalize是一个方法，当垃圾回收器确定不存在对该对象的更多引用时，由对象的垃圾回收器调用此方法
	     * 
	  * B:面试题2
	           * 如果catch语句中有return语句，finally代码还会执行吗？如果会，在return之前还是之后
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
	 * @Fields serialVersionUID : TODO(描述)
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
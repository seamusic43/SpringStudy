package kr.co.study.hello.exception;

public class BizException extends RuntimeException{

	public BizException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BizException(String message) {
		super(message);
		System.out.print(" BizException error " + message);
		// TODO Auto-generated constructor stub
	}

	public BizException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}


}

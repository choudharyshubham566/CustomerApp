package com.cust.exception;

public class CustomerNotFondException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public CustomerNotFondException() {
		super();
	}
	
	public CustomerNotFondException(String msg) {
		super(msg);
	}
}

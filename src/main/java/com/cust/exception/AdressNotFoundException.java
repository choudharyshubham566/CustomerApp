package com.cust.exception;


public class AdressNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public AdressNotFoundException() {
		super();
	}
	
	public AdressNotFoundException(String msg) {
		super(msg);
	}
}

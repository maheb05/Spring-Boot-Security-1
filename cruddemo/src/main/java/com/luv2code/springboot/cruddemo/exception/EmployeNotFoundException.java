package com.luv2code.springboot.cruddemo.exception;

public class EmployeNotFoundException extends RuntimeException{

	public EmployeNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public EmployeNotFoundException(String message) {
		super(message);
	}

	public EmployeNotFoundException(Throwable cause) {
		super(cause);
	}
	
}

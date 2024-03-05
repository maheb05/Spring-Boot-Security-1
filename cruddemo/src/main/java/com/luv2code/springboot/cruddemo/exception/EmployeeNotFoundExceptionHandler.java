package com.luv2code.springboot.cruddemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeNotFoundExceptionHandler {
	
	@ExceptionHandler(EmployeNotFoundException.class)
	public ResponseEntity<Object> employeeNotFoundExceptionHandler(EmployeNotFoundException e){
		EmployeException employeException = new EmployeException();
		employeException.setMessage(e.getMessage());
		employeException.setStatus(HttpStatus.NOT_FOUND.value());
		employeException.setTimeStamp(System.currentTimeMillis());
		return new ResponseEntity<>(employeException,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> exceptionHandler(Exception e){
		EmployeException employeException = new EmployeException();
		employeException.setMessage("Please check your entered url");
		employeException.setStatus(HttpStatus.BAD_REQUEST.value());
		employeException.setTimeStamp(System.currentTimeMillis());
		return new ResponseEntity<>(employeException,HttpStatus.BAD_REQUEST);
	}
}

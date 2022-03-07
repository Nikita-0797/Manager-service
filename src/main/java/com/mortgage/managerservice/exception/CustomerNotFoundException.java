package com.mortgage.managerservice.exception;

public class CustomerNotFoundException extends RuntimeException{

	public CustomerNotFoundException(String msg) {
		super(msg);
	}
}
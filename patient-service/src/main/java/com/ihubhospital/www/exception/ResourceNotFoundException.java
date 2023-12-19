package com.ihubhospital.www.exception;

public class ResourceNotFoundException extends RuntimeException {

	public ResourceNotFoundException(String msg){
		super(msg);
	}
}

package com.jspiders.car_rental_api_spring_boot_project.exception;

public class EmailAlreadyExistException  extends RuntimeException{

	
	public EmailAlreadyExistException(String msg)
	{
		super(msg);
	}

}

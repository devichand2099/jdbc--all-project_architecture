package com.jspiders.car_rental_api_spring_boot_project.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequestDTO {
	@NotBlank(message = "Email is Required")
	@Email(message = "Please Provide a valid Email Address")
	private String email;
	
	
	private String password;
	
	
	

}

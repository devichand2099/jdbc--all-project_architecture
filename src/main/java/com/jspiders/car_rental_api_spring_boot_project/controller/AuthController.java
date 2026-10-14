package com.jspiders.car_rental_api_spring_boot_project.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jspiders.car_rental_api_spring_boot_project.dto.LoginRequestDTO;
import com.jspiders.car_rental_api_spring_boot_project.service.CarOwnerService;
import com.jspiders.car_rental_api_spring_boot_project.service.CustomerService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@RestController
public class AuthController {

    private final CustomerService customerService;

    private final CarOwnerService carOwnerService;
    
    private final HttpSession httpSession


    AuthController(CarOwnerService carOwnerService) {
        this.carOwnerService = carOwnerService;


    AuthController(CustomerService customerService) {
        this.customerService = customerService;
    }
    }
	
	
	@PostMapping(value = "/registerCarOwner")
	public ResponseEntity<?> registerCarOwner()
	{
		return ResponseEntity.ok("Car Owner registered successfully!!");
	}
	
	@PostMapping(value = "/registerCustomer")
	public ResponseEntity<?> registerCustomer()
	{
		return ResponseEntity.ok("Customer registered successfully!!");
	}
	
	@PostMapping(value = "loginCarOwner")
	public ResponseEntity<?> loginCarOwner(@RequestBody @Valid LoginRequestDTO requestDTO)
	{
		return carOwnerService.loginCarOwnerService(requestDTO.httpSession);
		
	}
	
	
	public ResponseEntity<?>  loginCustomer()
	{
		return ResponseEntity.ok("Customer Logged Successfully!!");
		
		
	}
	

}

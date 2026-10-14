package com.jspiders.car_rental_api_spring_boot_project.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jspiders.car_rental_api_spring_boot_project.service.CarService;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/api/v1/carOwner")

@RequiredArgsConstructor
public class CarOwnerController {
	
	
	private final CarService carService;
	
	

	private final HttpSession httpSession;

	public ResponseEntity<?> logoutCarOwner()
	{
		String email=(String) httpSession.getAttribute("CarOwnerSession");

		if(email==null)
		{
			return ResponseEntity.ok("You are not logged in");


		}

		httpSession.invalidate();

		return ResponseEntity.ok("Customer Logout Successfully!!");
	}
	
	@GetMapping(value = "/carOwnerProfile")
	public ResponseEntity<?> carOwnerProfile()
	{
		String email=(String) httpSession.getAttribute("carOwnerSession");
		
		if(email==null)
		{
			return ResponseEntity.ok("You Are Not Logged in.");
			
			
		}
		return ResponseEntity.ok("Car Owner Performing Some Operation Successfully!!!");
	}
	
	@GetMapping(value = "/getAllCars")
	public ResponseEntity<?> getAllCarsService()
	{
		String email=(String) httpSession.getAttribute("carOwnerSession");
		
		if(email==null)
		{
			return ResponseEntity.ok().body("you are not logged in please login and then try!!");
			
			
		}
		return ResponseEntity.
	}
	
	
}

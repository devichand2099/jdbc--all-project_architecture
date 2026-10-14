package com.jspiders.car_rental_api_spring_boot_project.service;

import java.util.Locale;

import org.slf4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jspiders.car_rental_api_spring_boot_project.dto.LoginRequestDTO;
import com.jspiders.car_rental_api_spring_boot_project.entity.CarOwner;
import com.jspiders.car_rental_api_spring_boot_project.repository.CarOwnerRepository;

import jakarta.servlet.http.HttpSession;

@Service
public class CarOwnerService {
	
	CarOwnerRepository carOwnerRepository;
	
	
	
	
	
	public ResponseEntity<String> loginCarOwnerService(LoginRequestDTO requestDTO,HttpSession httpSession)
	{
		String email=requestDTO.getEmail().trim().toLowerCase(Locale.ROOT);
		
		CarOwner carOwner=carOwnerRepository.findByEmail(email)
				
				
				
		
		
	}

}

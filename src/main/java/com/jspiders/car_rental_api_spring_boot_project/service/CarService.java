package com.jspiders.car_rental_api_spring_boot_project.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jspiders.car_rental_api_spring_boot_project.dto.CarRequestDTO;
import com.jspiders.car_rental_api_spring_boot_project.entity.Car;
import com.jspiders.car_rental_api_spring_boot_project.repository.CarOwnerRepository;
import com.jspiders.car_rental_api_spring_boot_project.repository.CarRepository;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CarService {
	
	private final CarRepository carRepository;
	
	private final CarOwnerRepository carOwnerRepository;
	
	
	
	public ResponseEntity<CarResponseDTO> registerCarService(CarRequestDTO carRequestDTO,HttpSession httpSession)
	{
		String email=(String) httpSession.getAttribute("carOwnerSession");
		
		if(email==null)
		{
			throw new RuntimeException("not logged in pleasen login and then try!!");	
		}
	}
	public ResponseEntity<List<CarResponseDTO> getAllCarsService(HttpSession httpSession)
	{
		List<Car> cars=carRepository.findAll();
		
		return ResponseEntity.status(HttpStatus.OK).body(carMapper.toCarResponseDTOList(cars));
		
	}

}

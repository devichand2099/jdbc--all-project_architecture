package com.jspiders.car_rental_api_spring_boot_project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table(name = "tables")
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "car_seq")
	
	@SequenceGenerator(name="car_seq",sequenceName = "car_seq",allocationSize = 1,initialValue = 9001)
	private Long id;
	
	
	@Column(nullable = false,unique = true)
	private String vehicleNumber;
	
	@Column(nullable = false)
	private String brand;
	
	@Column(nullable = false)
	private String model;
	
	@Column(nullable = false)
	private String fuelType;
	
	@Column(nullable = false)
	private Integer seatingCapcity;
	
	@Column(nullable = false)
	private Double pricePerDay;
	
	@Column(nullable = false)
	private Double pricePerKm;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="car_owner_id" , nullable = false)
	private CarOwner carOwner;
	

}

package com.jspiders.car_rental_api_spring_boot_project.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Booking {
	
	
	@ManyToMany(mappedBy = "bookings")
	private List<Customer> customers;

}

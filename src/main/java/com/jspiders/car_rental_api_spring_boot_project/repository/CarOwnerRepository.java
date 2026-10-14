package com.jspiders.car_rental_api_spring_boot_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jspiders.car_rental_api_spring_boot_project.entity.CarOwner;
@Repository
public interface CarOwnerRepository  extends JpaRepository<CarOwner,Long>{

}

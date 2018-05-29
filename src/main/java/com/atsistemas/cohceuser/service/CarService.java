package com.atsistemas.cohceuser.service;

import java.util.List;
import java.util.Optional;

import com.atsistemas.cohceuser.dto.CarDTO;
import com.atsistemas.cohceuser.model.Car;

public interface CarService {

	Car create(CarDTO car);
	//void update(Integer idCar, CarDTO car);
	//void delete(Integer idCar);
	Optional<Car> findById(Integer idCar);
	List<Car> findAll();
	List<Car> findAllByUser(Integer idUser);
	
}

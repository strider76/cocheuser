package com.atsistemas.cohceuser.service;

import java.util.List;

public interface CarService {

	Car create(CarDTO car);
	void update(Integer idCar, CarDTO car);
	void delete(Integer idCar);
	Car findById(Integer idCar);
	List<Car> findAll();
	List<Car> findAllByUser(Integer idUser);
	
}

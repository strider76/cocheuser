package com.atsistemas.cohceuser.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.atsistemas.cohceuser.dto.CarDTO;
import com.atsistemas.cohceuser.model.Car;

@Service
public class CarServiceImpl implements CarService{

	@Override
	public Car create(CarDTO car) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Integer idCar, CarDTO car) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer idCar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Car findById(Integer idCar) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Car> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Car> findAllByUser(Integer idUser) {
		// TODO Auto-generated method stub
		return null;
	}

}

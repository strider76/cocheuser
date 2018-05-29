package com.atsistemas.cohceuser.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atsistemas.cohceuser.dao.CarDAO;
import com.atsistemas.cohceuser.dto.CarDTO;
import com.atsistemas.cohceuser.model.Car;

@Service
public class CarServiceImpl implements CarService {

	@Autowired
	CarDAO carDao;

	@Autowired
	//CarMapper carMapper;

	@Override
	public Car create(CarDTO car) {
		return null;
	}

	@Override
	public Optional<Car> findById(Integer idCar) {
		return carDao.findById(idCar);
	}

	@Override
	public List<Car> findAll() {
		return null;
		//return carDao.findAll().stream().collect(Collectors.toList());
	}

	@Override
	public List<Car> findAllByUser(Integer idUser) {
		return null;
	}

}

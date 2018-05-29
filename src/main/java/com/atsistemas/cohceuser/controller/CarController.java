package com.atsistemas.cohceuser.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.atsistemas.cohceuser.dto.CarDTO;
import com.atsistemas.cohceuser.mapper.car.CarMapper;
import com.atsistemas.cohceuser.model.Car;
import com.atsistemas.cohceuser.service.CarService;

@RestController
@RequestMapping(value="/car")
public class CarController {

	@Autowired
	CarService carService;
	
	@Autowired
	CarMapper carMapper;
	
	/************************************HTTP METHOD GET *************************************/
	@ResponseBody
	@GetMapping
	public List<CarDTO> findAll() {
		final List<Car> car = carService.findAll();
		return carMapper.modelToDto(car);
	}
	
	@GetMapping("/{idCar}")
	public CarDTO findById(@PathVariable Integer idCar) {
		final Optional<Car> car = carService.findById(idCar);
		return carMapper.modelToDto(car.get());
	}
	
	/************************************HTTP METHOD POST *************************************/
	@PostMapping
	public CarDTO create(@RequestBody CarDTO dto) {
		final Car car = carService.create(dto);
		return carMapper.modelToDto(car);
	}
	
}

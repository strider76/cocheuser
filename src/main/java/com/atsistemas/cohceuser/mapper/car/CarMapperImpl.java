package com.atsistemas.cohceuser.mapper.car;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.atsistemas.cohceuser.mapper.AbstractMapper;
import com.atsistemas.cohceuser.dto.CarDTO;
import com.atsistemas.cohceuser.model.Car;

@Component
public class CarMapperImpl extends AbstractMapper<Car,CarDTO> implements CarMapper {

	@Override
	public Class<? extends CarDTO> dtoClazz() {
		return CarDTO.class;
	}

	@Override
	public Class<? extends Car> modelClazz() {
		// TODO Auto-generated method stub
		return Car.class;
	}

	@Override
	public List<Car> dtoToModel(List<CarDTO> dtos) {
		// TODO Auto-generated method stub
		return dtos.stream().map(d -> dtoToModel(d)).collect(Collectors.toList());
	}

	@Override
	public List<CarDTO> modelToDto(List<Car> models) {
		return models.stream().map(m -> modelToDto(m)).collect(Collectors.toList());
	}

	@Override
	public Car dtoToModel(CarDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CarDTO modelToDto(Car model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Car> dtoToModel(Set<CarDTO> dtos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<CarDTO> modelToDto(Set<Car> models) {
		// TODO Auto-generated method stub
		return null;
	}




}
package com.atsistemas.cohceuser.dao;

import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.atsistemas.cohceuser.model.Car;

@Repository
public interface CarDAO extends PagingAndSortingRepository<Car, Integer> {

	// 1
	Optional<Car> findOneByIdCourse(int id);

	// Nombre
	Optional<Car> findOneByName(String model);

}

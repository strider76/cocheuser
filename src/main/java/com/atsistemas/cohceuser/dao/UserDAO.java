package com.atsistemas.cohceuser.dao;

import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.atsistemas.cohceuser.model.User;

@Repository
public interface UserDAO extends PagingAndSortingRepository<User, Integer> {

	// 1
	Optional<User> findOneByIdCourse(int id);

	// Nombre
	Optional<User> findOneByName(String name);

}

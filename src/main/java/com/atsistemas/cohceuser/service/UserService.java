package com.atsistemas.cohceuser.service;

import java.util.List;

import com.atsistemas.cohceuser.dto.UserDTO;
import com.atsistemas.cohceuser.model.Car;
import com.atsistemas.cohceuser.model.User;

public interface UserService {
	
	User create(UserDTO usuario);
	void update(Integer idUser, UserDTO usuario);
	void delete(Integer idUser);
	User findById(Integer idUsuario);
	List<User> findAll();
	List<Car> findCarByUser(Integer idUser);
}

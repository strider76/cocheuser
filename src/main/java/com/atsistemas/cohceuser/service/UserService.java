package com.atsistemas.cohceuser.service;

import java.util.List;

public interface UserService {
	
	User create(UserDTO usuario);
	void update(Integer idUser, UserDTO usuario);
	void delete(Integer idUser);
	User findById(Integer idUsuario);
	List<User> findAll();
	List<Car> findCarByUser(Integer idUser);
}

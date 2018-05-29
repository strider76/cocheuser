package com.atsistemas.cohceuser.controller;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.atsistemas.cohceuser.dto.UserDTO;
import com.atsistemas.cohceuser.mapper.user.UserMapper;
import com.atsistemas.cohceuser.service.UserService;


@RestController
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	UserService userService;

	@Autowired
	UserMapper userMapper;
	/************************************HTTP METHOD GET *************************************/
	@ResponseBody
	@RequestMapping(method=RequestMethod.GET)
	@ResponseStatus(HttpStatus.FOUND)
	public List<UserDTO> findAll{
				@RequestParam(value = "page", defaultValue="0",required = false) Integer page,
				@RequestParam(value = "size", defaultValue="10",required = false)Integer size){
		
			List<User> users=userService.findAll(PageRequest.of(page, size)).stream().collect(Collectors.toSet());
			return userMapper.modelToDto(users);
		
	}
	/************************************HTTP METHOD POST *************************************/
	/************************************HTTP METHOD PUT *************************************/
	/************************************HTTP METHOD DELETE *************************************/

}

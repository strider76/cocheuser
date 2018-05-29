package com.atsistemas.cohceuser.mapper.user;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.atsistemas.cohceuser.dto.UserPostDTO;
import com.atsistemas.cohceuser.mapper.AbstractMapper;
import com.atsistemas.cohceuser.model.User;

@Component
public class UserPostDTOMapperImpl extends AbstractMapper<User,UserPostDTO> implements UserPostDTOMapper {

	@Override
	public Class<? extends UserPostDTO> dtoClazz() {
		return UserPostDTO.class;
	}

	@Override
	public List<User> dtoToModel(List<UserPostDTO> dtos) {
		// TODO Auto-generated method stub
		return dtos.stream().map(d -> dtoToModel(d)).collect(Collectors.toList());
	}

	@Override
	public List<UserPostDTO> modelToDto(List<User> models) {
		// TODO Auto-generated method stub
		return models.stream().map(d -> modelToDto(d)).collect(Collectors.toList());
	}

	@Override
	public Class<? extends User> modelClazz() {
		return User.class;
	}






}
package com.atsistemas.cohceuser.mapper.car;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.atsistemas.cohceuser.dto.CarDTO;
import com.atsistemas.cohceuser.dto.CarPostDTO;
import com.atsistemas.cohceuser.mapper.AbstractMapper;

@Component
public class CarPostDTOMapperImpl extends AbstractMapper<CarDTO,CarPostDTO> implements CarPostDTOMapper {

	@Override
	public Class<? extends CarPostDTO> dtoClazz() {
		return CarPostDTO.class;
	}

	@Override
	public List<CarDTO> dtoToModel(List<CarPostDTO> dtos) {
		// TODO Auto-generated method stub
		return dtos.stream().map(d -> dtoToModel(d)).collect(Collectors.toList());
	}

	@Override
	public List<CarPostDTO> modelToDto(List<CarDTO> models) {
		// TODO Auto-generated method stub
		return models.stream().map(d -> modelToDto(d)).collect(Collectors.toList());
	}

	@Override
	public Class<? extends CarDTO> modelClazz() {
		return CarDTO.class;
	}






}
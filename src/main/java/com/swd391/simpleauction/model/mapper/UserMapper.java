package com.swd391.simpleauction.model.mapper;

import com.swd391.simpleauction.entities.User;
import com.swd391.simpleauction.model.dto.UserDTO;

public class UserMapper {

	public static UserDTO toUserDTO(User user) {
		UserDTO dto = new UserDTO();
		
		dto.setUserId(user.getUserId());
		dto.setEmail(user.getEmail());
		dto.setPassword(user.getPassword());
		dto.setAddress(user.getAddress());
		dto.setPhoneNumber(user.getPhoneNumber());
		dto.setRole(user.getRole());
		return dto;
	}
}

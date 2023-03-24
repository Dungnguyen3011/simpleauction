package com.swd391.simpleauction.service.imp;

import com.swd391.simpleauction.entities.User;
import com.swd391.simpleauction.model.dto.UserDTO;

public class UserServiceImp {

	public User toUser(UserDTO dto) {
		User u = new User();
		u.setUserId(dto.getUserId());
		u.setEmail(dto.getEmail());
		u.setPassword(dto.getPassword());
		u.setAddress(dto.getAddress());
		u.setPhoneNumber(dto.getPhoneNumber());
		u.setRole(dto.getRole());	
		return u;
	}
}

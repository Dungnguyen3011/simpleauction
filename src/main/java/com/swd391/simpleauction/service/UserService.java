package com.swd391.simpleauction.service;

import java.util.List;

import com.swd391.simpleauction.model.dto.UserDTO;

public interface UserService {

	public List<UserDTO> listAll();
	
	public UserDTO save(UserDTO dto);
	
	public UserDTO getById(int id);
}

package com.swd391.simpleauction.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.swd391.simpleauction.entities.User;
import com.swd391.simpleauction.model.dto.UserDTO;
import com.swd391.simpleauction.model.mapper.UserMapper;
import com.swd391.simpleauction.repositories.UserRepository;
import com.swd391.simpleauction.service.UserService;

@Service
@Transactional
public class UserServiceImp implements UserService {

	@Autowired
	UserRepository urp;
	
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

	@Override
	public List<UserDTO> listAll() {
		List<User> result = urp.findAll();
		List<UserDTO> listdto = new ArrayList<>();
		result.forEach(v-> listdto.add(UserMapper.toUserDTO(v)));
		return listdto;
	}

	@Override
	public UserDTO save(UserDTO dto) {
		User user = toUser(dto);
		return UserMapper.toUserDTO(urp.save(user));
	}


	@Override
	public UserDTO getById(int id) {
		User user = urp.findById(id).get();
		UserDTO dto = UserMapper.toUserDTO(user);
		return dto;
	}
}

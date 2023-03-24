package com.swd391.simpleauction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swd391.simpleauction.model.dto.UserDTO;
import com.swd391.simpleauction.service.UserService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class UserController {

	@Autowired
	UserService usv;
	
	@GetMapping("/user")
	public ResponseEntity<?> getAll(){
		List<UserDTO> listuser = usv.listAll();
		return ResponseEntity.ok(listuser);
	}
	
	@PostMapping("/user")
	public ResponseEntity<?> saveNew(@RequestBody UserDTO dto){
		return ResponseEntity.ok(usv.save(dto));
	}
	
	@GetMapping("/userbyid")
	public ResponseEntity<?> getById(@Param("id")int id){
		return ResponseEntity.ok(usv.getById(id));
	}
}

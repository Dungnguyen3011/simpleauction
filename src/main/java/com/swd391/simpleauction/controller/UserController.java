package com.swd391.simpleauction.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.swd391.simpleauction.model.User;

@RestController
public class UserController {

	@GetMapping("/user")
	public ResponseEntity<User> getUser(String id){
		if("1".equals(id)) {
			User user = new User();
			user.setId("1");
			user.setName("live code");
			return ResponseEntity.ok(user);
		}else {
			throw new ResponseStatusException(HttpStatus.CONFLICT, "Not found");
		}	
	}
}

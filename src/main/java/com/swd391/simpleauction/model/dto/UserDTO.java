package com.swd391.simpleauction.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

	private Integer userId;
	
	private String email;
	
	private String password;
	
	private Integer phoneNumber;
	
	private String address;

	private Boolean role;
}

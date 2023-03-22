package com.swd391.simpleauction.model.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemDTO {

	private Integer itemId;
	
	private String itemName;
	
	private String description;
	
	private Float startingPrice;
	
	private Date endTime;
	
	private Boolean published;
	
	private Integer userId;
}

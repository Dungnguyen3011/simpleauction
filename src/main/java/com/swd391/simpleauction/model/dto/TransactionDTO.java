package com.swd391.simpleauction.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDTO {
	private Integer transactionId;
	
	
	private Float transactionPrice;
	
	
	private Integer itemId;
	
	
	private Integer userId;
	
//	@NotNull
//	private Integer biddingId;
}

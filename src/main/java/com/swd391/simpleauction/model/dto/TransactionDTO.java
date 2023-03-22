package com.swd391.simpleauction.model.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDTO {
	private Integer transactionId;
	
	@NotNull
	private Float transactionPrice;
	
	@NotNull
	private Integer itemId;
	
	@NotNull
	private Integer userId;
	
	@NotNull
	private Integer biddingId;
}

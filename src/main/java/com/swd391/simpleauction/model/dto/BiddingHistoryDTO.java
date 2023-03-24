package com.swd391.simpleauction.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BiddingHistoryDTO {

	private Integer biddingId;
	
	private Float finalPrice;
	
	private Integer transactionId;
}

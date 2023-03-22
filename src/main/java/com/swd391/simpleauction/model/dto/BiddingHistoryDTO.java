package com.swd391.simpleauction.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BiddingHistoryDTO {

	private Integer biddingId;
	private Integer transactionId;
	private Float finalPrice;
}

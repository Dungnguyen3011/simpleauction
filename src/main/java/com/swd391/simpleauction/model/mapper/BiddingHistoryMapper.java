package com.swd391.simpleauction.model.mapper;

import com.swd391.simpleauction.entities.BiddingHistory;
import com.swd391.simpleauction.model.dto.BiddingHistoryDTO;

public class BiddingHistoryMapper {

	public static BiddingHistoryDTO toBiddingHDTO(BiddingHistory bh) {	
		BiddingHistoryDTO dto = new BiddingHistoryDTO();
		dto.setBiddingId(bh.getBiddingId());
		dto.setFinalPrice(bh.getFinalPrice());
		dto.setTransactionId(bh.getTransaction().getTransactionId());
		return dto;
	}
}

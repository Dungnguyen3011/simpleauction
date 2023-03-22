package com.swd391.simpleauction.mapper;

import com.swd391.simpleauction.entities.BiddingHistory;
import com.swd391.simpleauction.model.dto.BiddingHistoryDTO;

public class BiddingHistoryMapper {

	public static BiddingHistoryDTO toBiddingHistoryDTO(BiddingHistory bidd) {
		BiddingHistoryDTO bidDTO=new BiddingHistoryDTO();
		bidDTO.setBiddingId(bidd.getBiddingId());
		bidDTO.setTransactionId(bidd.getTransactionId());
		bidDTO.setFinalPrice(bidd.getFinalPrice());
		return bidDTO;
	}
}

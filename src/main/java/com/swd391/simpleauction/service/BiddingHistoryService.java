package com.swd391.simpleauction.service;

import java.util.List;

import com.swd391.simpleauction.model.dto.BiddingHistoryDTO;

public interface BiddingHistoryService {
	
	public Boolean saleItem(BiddingHistoryDTO dto);

	public List<BiddingHistoryDTO> getAll();
	
	public BiddingHistoryDTO getBidById(int id);
}

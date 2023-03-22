package com.swd391.simpleauction.service;

import java.util.List;

import com.swd391.simpleauction.entities.BiddingHistory;
import com.swd391.simpleauction.model.dto.BiddingHistoryDTO;

public interface BiddingHistoryService {
	public List<BiddingHistoryDTO> listBiddingHistoryById(int id);
}

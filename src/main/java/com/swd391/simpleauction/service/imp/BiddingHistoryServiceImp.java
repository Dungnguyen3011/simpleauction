package com.swd391.simpleauction.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.swd391.simpleauction.entities.BiddingHistory;
import com.swd391.simpleauction.mapper.BiddingHistoryMapper;
import com.swd391.simpleauction.model.dto.BiddingHistoryDTO;
import com.swd391.simpleauction.repositories.BiddingHistoryRepository;
import com.swd391.simpleauction.service.BiddingHistoryService;

public class BiddingHistoryServiceImp implements BiddingHistoryService {

	@Autowired
	BiddingHistoryRepository biddingHistorRepo;
	
	@Override
	public List<BiddingHistoryDTO> listBiddingHistoryById(int id){
		List<BiddingHistory> bidhis=biddingHistorRepo.ListDetailByBiddingId(id);
		List<BiddingHistoryDTO> dto=new ArrayList<>();
		bidhis.forEach(vv-> dto.add(BiddingHistoryMapper.toBiddingHistoryDTO(vv)));
		return dto;
	}
}

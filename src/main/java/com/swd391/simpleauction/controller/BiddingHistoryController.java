package com.swd391.simpleauction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swd391.simpleauction.model.dto.BiddingHistoryDTO;
import com.swd391.simpleauction.service.BiddingHistoryService;

@RestController
public class BiddingHistoryController {

	@Autowired
	BiddingHistoryService bsv;
	
	@GetMapping("/biddinghistory")
	public ResponseEntity<?> getAll(){
		List<BiddingHistoryDTO> listdto = bsv.getAll();
		return ResponseEntity.ok(listdto);
	}
	
	@PostMapping("/biddinghistorybyid")
	public ResponseEntity<?> getById(@Param("id") int id){
		return ResponseEntity.ok(bsv.getBidById(id));
	}
	
}

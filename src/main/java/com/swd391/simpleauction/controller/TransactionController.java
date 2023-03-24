package com.swd391.simpleauction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swd391.simpleauction.model.dto.BiddingHistoryDTO;
import com.swd391.simpleauction.model.dto.TransactionDTO;
import com.swd391.simpleauction.service.BiddingHistoryService;
import com.swd391.simpleauction.service.TransactionService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class TransactionController {
	
	@Autowired
	TransactionService tsv;
	
	@Autowired
	BiddingHistoryService bsv;

	@GetMapping("/transaction")
	public ResponseEntity<?> getAll(){
		List<TransactionDTO> transactionlist = tsv.listAll();
		return ResponseEntity.ok(transactionlist);
	}
	
	@PostMapping("/addbidhistory")
	public ResponseEntity<?> saveTranandItem(@RequestBody TransactionDTO trandto){
		tsv.save(trandto);
		int id = tsv.getByPriceAndItemId(trandto.getItemId(), trandto.getTransactionPrice()).getTransactionId();
		BiddingHistoryDTO dto = new BiddingHistoryDTO();
		dto.setFinalPrice(1000f);
		dto.setTransactionId(id);
		return ResponseEntity.ok(bsv.saleItem(dto));
	}
	
	@PostMapping("/test")
	public ResponseEntity<?> test(@Param("test") Integer id){
		System.out.println(id);
		return ResponseEntity.ok(id);
	}
}

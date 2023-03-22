package com.swd391.simpleauction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swd391.simpleauction.model.dto.TransactionDTO;
import com.swd391.simpleauction.service.TransactionService;

@RestController
public class TransactionController {
	
	@Autowired
	TransactionService Tsv;

	@GetMapping("/transaction")
	public ResponseEntity<?> getAll(){
		List<TransactionDTO> transactionlist = Tsv.listAll();
		return ResponseEntity.ok(transactionlist);
	}
}

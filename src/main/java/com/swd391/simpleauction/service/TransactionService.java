package com.swd391.simpleauction.service;

import java.util.List;

import com.swd391.simpleauction.model.dto.TransactionDTO;

public interface TransactionService {
	
	public List<TransactionDTO> listAll();
	
	public TransactionDTO save(TransactionDTO transactiondto);
	
	public TransactionDTO getbyId(int id);
}

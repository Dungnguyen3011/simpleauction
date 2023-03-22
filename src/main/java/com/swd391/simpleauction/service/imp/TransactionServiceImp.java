package com.swd391.simpleauction.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.swd391.simpleauction.entities.Transaction;
import com.swd391.simpleauction.model.dto.TransactionDTO;
import com.swd391.simpleauction.model.mapper.TransactionMapper;
import com.swd391.simpleauction.repositories.TransactionRepository;
import com.swd391.simpleauction.service.TransactionService;

@Service
@Transactional
public class TransactionServiceImp implements TransactionService{
	
	@Autowired
	TransactionRepository rp;
	
	public Transaction toTransaction(TransactionDTO dto) {
		Transaction transaction = new Transaction();
		return transaction;
	}

	@Override
	public List<TransactionDTO> listAll() {
		List<Transaction> result = rp.findAll();
		List<TransactionDTO> listtrandto = new ArrayList<>();
		result.forEach(v -> listtrandto.add(TransactionMapper.toTransactionDTO(v)));
		return listtrandto;
	}

	@Override
	public TransactionDTO save(TransactionDTO transactiondto) {
		
		return null;
	}

	@Override
	public TransactionDTO getbyId(int id) {
		Transaction transaction = rp.findById(id).get();
		TransactionDTO trandto = TransactionMapper.toTransactionDTO(transaction);
		return trandto;
	}

}

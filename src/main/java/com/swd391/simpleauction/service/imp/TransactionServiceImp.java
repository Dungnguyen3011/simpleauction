package com.swd391.simpleauction.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.swd391.simpleauction.entities.Item;
import com.swd391.simpleauction.entities.Transaction;
import com.swd391.simpleauction.entities.User;
import com.swd391.simpleauction.model.dto.TransactionDTO;
import com.swd391.simpleauction.model.mapper.TransactionMapper;
import com.swd391.simpleauction.repositories.ItemRepository;
import com.swd391.simpleauction.repositories.TransactionRepository;
import com.swd391.simpleauction.repositories.UserRepository;
import com.swd391.simpleauction.service.TransactionService;

@Service
@Transactional
public class TransactionServiceImp implements TransactionService{
	
	@Autowired
	TransactionRepository rp;
	
	@Autowired
	UserRepository urp;
	
	@Autowired
	ItemRepository irp;
	
	public Transaction toTransaction(TransactionDTO dto) {
		Transaction tran = new Transaction();
		tran.setTransactionId(dto.getTransactionId());
		tran.setTransactionPrice(dto.getTransactionPrice());
		//tran.setTransactionPrice(15000000f);
		tran.setUser(getUserById(dto.getUserId()));
		//tran.setUser(getUserById(2));
		tran.setItem(getItemById(dto.getItemId()));
		//tran.setItem(getItemById(1));
		return tran;
		
	}
	public User getUserById(int id ) {
		return urp.findById(id).get();
	}
	
	public Item getItemById(int id) {
		return irp.findById(id).get();
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
		Transaction tran =  toTransaction(transactiondto);
		return TransactionMapper.toTransactionDTO(rp.save(tran));
	}

	@Override
	public TransactionDTO getbyId(int id) {
		Transaction transaction = rp.findById(id).get();
		TransactionDTO trandto = TransactionMapper.toTransactionDTO(transaction);
		return trandto;
	}
	@Override
	public Transaction getByPriceAndItemId(Integer id, Float price) {
		return rp.FindByTransactionPriceAndItemId(id, price);
	}
	
	
	

}

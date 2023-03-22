package com.swd391.simpleauction.model.mapper;

import com.swd391.simpleauction.entities.Transaction;
import com.swd391.simpleauction.model.dto.TransactionDTO;

public class TransactionMapper {

	public static TransactionDTO toTransactionDTO(Transaction transaction) {
		TransactionDTO trandto = new TransactionDTO();
		trandto.setTransactionId(transaction.getTransactionID());
		trandto.setTransactionPrice(transaction.getTransactionPrice());
		trandto.setItemId(transaction.getItem().getItemId());
		trandto.setUserId(transaction.getUser().getUserId());
		trandto.setBiddingId(transaction.getBiddinghistory().getBiddingId());
		return trandto;
	}
}

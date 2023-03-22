package com.swd391.simpleauction.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swd391.simpleauction.entities.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
	
}

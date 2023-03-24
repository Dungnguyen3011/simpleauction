package com.swd391.simpleauction.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.swd391.simpleauction.entities.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
	
	@Query("SELECT t FROM Transaction t WHERE t.item.itemId = :itemId AND t.transactionPrice = (SELECT MAX(t2.transactionPrice) FROM Transaction t2 WHERE t2.item.itemId = :itemId)")
    Transaction findHighestTransactionByItemId(@Param("itemId") Integer itemId);
	
	@Query("SELECT t FROM Transaction t WHERE t.transactionId = :transactionId AND t.transactionPrice = (SELECT MAX(t2.transactionPrice) FROM Transaction t2 WHERE t2.transactionId = :transactionId)")
	Transaction findHighestTransactionByTranId(@Param("transactionId") Integer transactionId);
	
	@Query("SELECT t FROM Transaction t WHERE t.transactionPrice = :transactionPrice AND t.item.itemId = :itemId")
	Transaction FindByTransactionPriceAndItemId(Integer itemId,Float transactionPrice );
}

package com.swd391.simpleauction.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "tbl_transaction")
@Entity
@NoArgsConstructor
public class Transaction {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="transaction_id", nullable = false, updatable = false)
	private Integer transactionID;
	
	@Column(name="transaction_price")
	private Float transactionPrice;
	
	
	private String itemId;
	
	
	private String userId;
}

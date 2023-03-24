package com.swd391.simpleauction.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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
	private Integer transactionId;
	
	@Column(name="transaction_price")
	private Float transactionPrice;
	
	@ManyToOne
	@JoinColumn(name = "item_id")
	@JsonBackReference
	private Item item;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	@JsonBackReference
	private User user;
	
	@JsonManagedReference
	@OneToOne(mappedBy = "transaction", fetch = FetchType.LAZY)
    private BiddingHistory biddinghistory;
}

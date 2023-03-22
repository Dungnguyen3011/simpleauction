package com.swd391.simpleauction.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "tbl_bidding_history")
@Entity
@NoArgsConstructor
public class BiddingHistory {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="bidding_id", nullable = false, updatable = false)
	private Integer biddingId;
	
	@ManyToOne
	@JsonBackReference
	@Column(name="transaction_id")
	private Integer transactionId;
	
	@Column(name="final_price")
	private Float finalPrice;
		
}

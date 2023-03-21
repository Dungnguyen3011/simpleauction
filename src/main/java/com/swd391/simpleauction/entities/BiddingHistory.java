package com.swd391.simpleauction.entities;

import java.sql.Date;

public class BiddingHistory {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="bidding_id", nullable = false, updatable = false)
	private Integer biddingId;
	
	@Column(name="transaction_id")
	private Integer transactionId;
	
	@Column(name="final_price")
	private Float finalPrice;
		
}

package com.swd391.simpleauction.entities;

import java.sql.Date;

public class BiddingHistory {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="bidding_id", nullable = false, updatable = false)
	private Integer biddingId;
	
	
	private Integer transactionId;
	
	private Float finalPrice;
	
	
}

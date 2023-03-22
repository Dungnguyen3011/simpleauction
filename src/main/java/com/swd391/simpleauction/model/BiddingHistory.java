package com.swd391.simpleauction.model;


public class BiddingHistory {

	 Integer biddingId;
	 Integer transactionId;
	 Float finalPrice;
	 
	 public Integer getbiddingId() {
			return biddingId;
		}
		public void setbiddingId(Integer id) {
			this.biddingId = id;
		}
		public Integer gettransactionId() {
			return transactionId;
		}
		public void settransactionId(Integer id) {
			this.transactionId = id;
			
		}
		
		public Float getfinalPrice() {
			return finalPrice;
		}
		private void setfinalPrice(Float price) {
			this.finalPrice=price;
		}
}

package com.swd391.simpleauction.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.swd391.simpleauction.entities.BiddingHistory;

public interface BiddingHistoryRepository extends JpaRepository<BiddingHistory, Integer> {

	@Query(value="SELECT d FROM BiddingHistory d WHERE d.bidding_history.biddingId = :id")
	List<BiddingHistory> ListDetailByBiddingId(Integer id);
}

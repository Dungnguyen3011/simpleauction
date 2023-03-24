package com.swd391.simpleauction.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swd391.simpleauction.entities.BiddingHistory;

public interface BiddingHistoryRepository extends JpaRepository<BiddingHistory, Integer> {

}

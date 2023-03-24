package com.swd391.simpleauction.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.swd391.simpleauction.entities.BiddingHistory;
import com.swd391.simpleauction.entities.Transaction;
import com.swd391.simpleauction.model.dto.BiddingHistoryDTO;
import com.swd391.simpleauction.repositories.BiddingHistoryRepository;
import com.swd391.simpleauction.repositories.TransactionRepository;
import com.swd391.simpleauction.service.BiddingHistoryService;

@EnableScheduling
@Service
@Transactional
public class BiddingHistoryServiceImp implements BiddingHistoryService {

	//@Value("${cronexpression}")
	//public String datecron = "00 58 01 24 03 ? 2023";
	
	public int id = 2;
	
	public boolean started = false;
	
	@Autowired
	BiddingHistoryRepository rp;
	
	@Autowired
	TransactionRepository trp;
	
//	@Bean
//	public Timestamp getDateValue(int id)
//	{
//	    return trp.findById(id).get().getItem().getEndTime();
//	}
	
	public BiddingHistory toBiddingHistory(BiddingHistoryDTO dto) {
		BiddingHistory bh = new BiddingHistory();
		
		bh.setBiddingId(dto.getBiddingId());
		bh.setFinalPrice(dto.getFinalPrice());
		bh.setTransaction(getById(dto.getTransactionId()));	
		return bh;
	}
	
	public BiddingHistory toBiddingHistorywHighestPrice(BiddingHistoryDTO dto) {
		BiddingHistory bh = new BiddingHistory();	
		bh.setBiddingId(dto.getBiddingId());
		bh.setTransaction(trp.findHighestTransactionByItemId(getById(dto.getTransactionId()).getItem().getItemId()));	
		bh.setFinalPrice(trp.findHighestTransactionByItemId(getById(dto.getTransactionId()).getItem().getItemId()).getTransactionPrice());
		return bh;
	}
	
	public Transaction getById(int id) {
		return trp.findById(id).get();
	}
		
	
	@Override
	public Boolean saleItem(BiddingHistoryDTO dto) {
		// bh = toBiddingHistory(dto);
		//SimpleDateFormat dateFormat = new SimpleDateFormat("ss mm HH dd MM ? yyyy");
        //datecron = dateFormat.format(bh.getTransaction().getItem().getEndTime());
		id = dto.getTransactionId();
		started=true;
		//saveSaleitem();
		return true;
	}
	
	@Scheduled(cron = "00 05 14 24 03 ?")
	public void saveSaleitem() {
		if(!started) {
			return;
		}else {
		BiddingHistoryDTO dto = new BiddingHistoryDTO();
		dto.setFinalPrice(100000f);
		dto.setTransactionId(id);
		BiddingHistory bh = toBiddingHistorywHighestPrice(dto);
		rp.save(bh);
		}
	}

}

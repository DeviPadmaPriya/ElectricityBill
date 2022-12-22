package com.electricity.bill.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electricity.bill.entity.bill;
import com.electricity.bill.repository.billRepository;


@Service
public class billServiceImpl implements billService{

	private static final Logger log = LoggerFactory.getLogger(billServiceImpl.class);
	
	@Autowired
	private billRepository billRepo;
	
	@Override
	public List<bill> getAllBills() {
		List<bill> lists = this.billRepo.findAll();
		return lists;
	}

	@Override
	public bill saveBillDetails(bill billl) {
		log.info("payment Added Successfully");
		bill bill1 = billRepo.save(billl);
		return bill1;
	}

	@Override
	public bill getBillById(Long billId) {

		bill bill2 = billRepo.findById(billId).get();
		return bill2;
	}

	@Override
	public bill updateBill(bill billl) {
//		bill bill3 =  billRepo.findById().get();
//		bill3.setBilldueDate(billl.getBilldueDate());
//		bill3.setBillDate(billl.getBillDate());
//		bill3.setUnitsConsumed(billl.getUnitsConsumed());
//		bill3.setBillAmount(billl.getBillAmount());
//		bill3.setStatus(billl.getStatus().toUpperCase());

		return billRepo.save(billl);
	}

	@Override
	
	public void deleteBill(Long billId) {
		billRepo.deleteById(billId);
		//return "Payment deleted";
		
	}

}

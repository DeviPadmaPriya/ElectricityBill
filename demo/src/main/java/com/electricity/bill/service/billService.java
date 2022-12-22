package com.electricity.bill.service;

import java.util.List;

import com.electricity.bill.entity.bill;

public interface billService {

	public List<bill> getAllBills();
	public bill saveBillDetails(bill billl);
	public bill getBillById(Long billId);
	public bill updateBill(bill billl);
	void  deleteBill(Long id);

	
	
	
}

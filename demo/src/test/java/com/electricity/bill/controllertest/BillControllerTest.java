package com.electricity.bill.controllertest;


import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.electricity.bill.controller.billController;
import com.electricity.bill.entity.bill;
import com.electricity.bill.service.billService;


@ExtendWith(MockitoExtension.class)
public class BillControllerTest {
	@InjectMocks
	billController billcontroller;
	
	@Mock
	billService billservice;
	
	@Test
	void getAllBillTest() {
		List<bill> bill = createBillMockData();
		when(billservice.getAllBills()).thenReturn(bill);
		
		List<bill> billList = billcontroller.listAllBills();
		assert(bill.size() == billList.size());
	}
	@Test
	void saveBillTest() {
		bill consumer = BillMockData();
		when(billservice.saveBillDetails(consumer)).thenReturn(consumer);
		
		bill consumersList = billcontroller.saveBill(consumer);
		assert(consumer.getBillId() == consumersList.getBillId());
		
	}
	
	@Test
	void deleteBillTest() {
		long id = 1;
		String msg = "bill deleted";
		doNothing().when(billservice).deleteBill(id);
		String message = billcontroller.deleteBill(id);
		assert(message.equals(msg));
	}

	
	private List<bill> createBillMockData() {
		List<bill> bills = new ArrayList<>();
		bill bill = new bill();
		bill.setBillId(null);
		bill.setBillAmount(100);
		bill.setBillDate("21-07-2002");
		bill.setBilldueDate("21-3-2002");
		
		bill.setStatus("Not paid");
		bill.setUnitsConsumed(500);
		bills.add(bill);
		return bills;
		
	}
	
	private bill BillMockData() {
		bill bill = new bill();
		bill.setBillId(null);
		bill.setBillAmount(100);
		bill.setBillDate("21-07-2002");
		bill.setBilldueDate("21-3-2002");
		
		bill.setStatus("Not paid");
		bill.setUnitsConsumed(500);
		
		return bill;
		
	}
	
	

}

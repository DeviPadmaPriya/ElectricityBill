package com.electricity.payment.controllerTest;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

//import com.electricity.bill.entity.bill;
//import com.electricity.bill.entity.bill;
//import com.electricity.bill.entity.bill;
import com.electricity.payment.controller.paymentController;
import com.electricity.payment.entity.payment;
import com.electricity.payment.service.paymentService;



@ExtendWith(MockitoExtension.class)
public class PaymentControllerTest {
	
	@InjectMocks
	paymentController paymentController;
	
	@Mock
	paymentService paymentService;
	
	@Test
	void getAllBillTest() {
		List<payment> payment = createPaymentMockData();
		when(paymentService.getAllPayments()).thenReturn(payment);
		
		List<payment> payments = paymentController.listAllPayments();
		assert(payment.size() == payments.size());
	}
	
	@Test
	void saveBillTest() {
		payment consumer = PaymentMockData();
		when(paymentService.savePaymentDetails(consumer)).thenReturn(consumer);
		
		payment consumersList = paymentController.savePayment(consumer);
		assert(consumer.getBillId() == consumersList.getBillId());
		
	}
	@Test
	void deleteBillTest() {
		long id = 1;
		String msg = "payment deleted";
		doNothing().when(paymentService).deletePayment(id);;
		String message = paymentController.deletePayment(id);
		assert(message.equals(msg));
	}
	
	private List<payment> createPaymentMockData() {
		List<payment> payments = new ArrayList<>();
		payment payment = new payment();
		payment.setAccountNumber(null);
		payment.setAmount(2332);
		payment.setBillId(null);
		payment.setCardHolderName("dkslajds");
		payment.setCardNumber(null);
		payment.setCvv(222);
		payment.setLatePaymentCharges(23432);
		payment.setPaymentDate("12-07-2002");
		payment.setPaymentId(null);
		payment.setStatus("paid");
		payment.setTotalPaid(3242);
		payments.add(payment);
		return payments;
		
	}
	
	private payment PaymentMockData() {
		
		payment payment = new payment();
		payment.setAccountNumber(null);
		payment.setAmount(2332);
		payment.setBillId(null);
		payment.setCardHolderName("dkslajds");
		payment.setCardNumber(null);
		payment.setCvv(222);
		payment.setLatePaymentCharges(23432);
		payment.setPaymentDate("12-07-2002");
		payment.setPaymentId(null);
		payment.setStatus("paid");
		payment.setTotalPaid(3242);
		
		return payment;
		
	}
	
	

}

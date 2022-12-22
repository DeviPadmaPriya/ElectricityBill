package com.electricity.payment.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.electricity.payment.entity.payment;

@Component
public interface paymentService {

	public payment savePaymentDetails(payment pay);
	public payment getPaymentById(Long paymentId);
	public void deletePayment(Long paymentId);
	public payment updatePayment(payment pay);
	public List<payment> getAllPayments();
	//public payment updateBill(payment pay);
	
}

package com.electricity.payment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electricity.payment.entity.payment;
import com.electricity.payment.exceptions.BusinessException;
import com.electricity.payment.repository.paymentRepository;
import com.electricity.payment.service.paymentService;

@Service
public class paymentServiceImpl implements paymentService{
	
	@Autowired
	private paymentRepository paymentrepo;
	

	@Override
	public payment savePaymentDetails(payment pay) {
		// TODO Auto-generated method stub
		
		try {
			if( pay.getAccountNumber().SIZE < 12) {
				throw new BusinessException("601","Account Number is null");
			}
			payment payment1 = paymentrepo.save(pay);
			return payment1;
		}catch (Exception e){
			throw new BusinessException("602","Some Payment Details are empty, please fill out all "+ e.getMessage());
		}
		
	}

	@Override
	public payment getPaymentById(Long paymentId) {
		// TODO Auto-generated method stub
		payment payment2 = paymentrepo.findById(paymentId).get();
		return payment2;
	}

	@Override
	public void deletePayment(Long paymentId) {
		// TODO Auto-generated method stub
		paymentrepo.deleteById(paymentId);
		//return "Payment deleted";
	}

	@Override
	public payment updatePayment(payment pay) {
		// TODO Auto-generated method stub
		
		
		
		
		return paymentrepo.save(pay);
	}

	@Override
	public List<payment> getAllPayments() {
		// TODO Auto-generated method stub
		List<payment> lists = this.paymentrepo.findAll();
		return lists;
	}

}

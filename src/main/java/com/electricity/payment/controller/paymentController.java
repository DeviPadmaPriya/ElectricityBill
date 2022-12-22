package com.electricity.payment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//
//import com.electricity.bill.ecxeption.BillException;
//import com.electricity.bill.entity.bill;
import com.electricity.payment.entity.payment;
import com.electricity.payment.exception.PaymentException;
import com.electricity.payment.service.paymentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
@Slf4j
public class paymentController {
	
	@Autowired
	private paymentService paymentservice;
	
	
	@GetMapping("/v1/payment")
	public List<payment> listAllPayments(){
		
		List<payment> lists = this.paymentservice.getAllPayments();
		System.out.println(lists);
				
		return lists;
	}
	
	@PostMapping("/v1/payment" )
	public payment savePayment(@RequestBody payment pay){
		
		payment payments = this.paymentservice.savePaymentDetails(pay);
				
		return payments;
	}
	
	@GetMapping("/v1/payment/{id}")
	public ResponseEntity<Object> getPaymentById(@PathVariable("id") Long paymentId){
		payment consumer;
		//Cart resultCart;
		
        try {
        	consumer = paymentservice.getPaymentById(paymentId);
        	System.out.println(consumer);
        	//log.info("Exited into get method in bill controller");
            return new ResponseEntity<Object>(consumer, HttpStatus.OK);
        } catch (PaymentException e) {
        	
            return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
		//return null;
		
		
	}
	
	@PutMapping("/v1/payment/{id}")
	public ResponseEntity<Object> updatePayment(@RequestBody payment pay){
				payment consumerdto;
		try {
			consumerdto = paymentservice.updatePayment(pay);
			System.out.println(consumerdto);
            return new ResponseEntity<Object>(consumerdto, HttpStatus.OK);
        } catch (PaymentException e) {
        	
            return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
		
	}
	
	@DeleteMapping("/v1/payment/{id}")
	
	public String deletePayment(@PathVariable("id") Long id){
				paymentservice.deletePayment(id);
		
		return "payment deleted";
		
		
		
	}

}

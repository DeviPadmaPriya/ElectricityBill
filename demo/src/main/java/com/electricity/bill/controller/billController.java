package com.electricity.bill.controller;

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

//import com.cg.consumer.entity.Consumer;
//import com.cg.consumer.exceptions.ConsumerException;
////
//import com.cg.consumer.entity.Consumer;
//import com.cg.consumer.exceptions.ConsumerException;
import com.electricity.bill.ecxeption.BillException;
import com.electricity.bill.entity.bill;
import com.electricity.bill.service.billService;

import lombok.extern.slf4j.Slf4j;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
@Slf4j
public class billController {
	
	@Autowired
	private billService billservice;
	
	@GetMapping("/v1/bill")
	public List<bill> listAllBills(){
		
		List<bill> lists = this.billservice.getAllBills();
		System.out.println(lists);
				return lists;
	}
	
	
	@PostMapping("/v1/bill" )
	public bill saveBill(@RequestBody bill billl){
		
		bill bills = this.billservice.saveBillDetails(billl);
		System.out.println(bills);
				
		return billl;
	}
	@GetMapping("/v1/bill/{id}")
	public ResponseEntity<Object> getBillById(@PathVariable("id") Long billId) throws BillException{
		bill consumer;
		//Cart resultCart;
		
        try {
        	consumer = billservice.getBillById(billId);
        	System.out.println(consumer);
        	//log.info("Exited into get method in bill controller");
            return new ResponseEntity<Object>(consumer, HttpStatus.OK);
        } catch (BillException e) {
        	            return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
		//return null;
		
		
	}
	
	@PutMapping("/v1/bill/{id}")
	public ResponseEntity<Object> updateBill(@RequestBody bill consumer) {
		
		bill consumerdto;
		try {
			consumerdto = billservice.updateBill(consumer);
			System.out.println(consumerdto);
            return new ResponseEntity<Object>(consumerdto, HttpStatus.OK);
        } catch (BillException e) {
        	
            return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
		
	}
	

	
	@DeleteMapping("/v1/bill/{id}")
	public String deleteBill(@PathVariable("id") Long id){
		
		
		billservice.deleteBill(id);
				return "bill deleted";
		
	}
	
	
	
}

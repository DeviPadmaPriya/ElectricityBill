package com.cg.consumer.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.consumer.entity.Consumer;
import com.cg.consumer.exceptions.ConsumerException;
import com.cg.consumer.service.ConsumerService;


import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@CrossOrigin(value = "*")
@Slf4j
public class ConsumerController {
	@Autowired
	ConsumerService consumerService;
	
	@GetMapping("/v1/consumer")
	public List<Consumer> getAllConsumer(){
		
		List<Consumer> consumer = consumerService.getAllConsumer();
		System.out.println("list of consumers" + consumer);
		
		return consumer;
		
	}
	
	@GetMapping("/v1/consumer/{id}")
	public ResponseEntity<Object> getConsumer(@PathVariable long id) throws ConsumerException{
		Consumer consumer;
		//Cart resultCart;
		
        try {
        	consumer = consumerService.getConsumer(id);
        	System.out.println(consumer);
        	            return new ResponseEntity<Object>(consumer, HttpStatus.OK);
            
        } catch (ConsumerException e) {
            return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
            
        }
		
		
	}
	@Validated
	@PostMapping("/v1/consumer")
	public Consumer saveConsumer(@RequestBody @Valid Consumer consumer) {
		
		Consumer consumerdto = consumerService.saveConsumer(consumer);
		System.out.println(consumerdto);
		
		return consumerdto;
	}
	
	@PutMapping("/v1/consumer/{id}")
	public ResponseEntity<Object> updateConsumer(@RequestBody Consumer consumer) {
		Consumer consumerdto;
		
		try {
			consumerdto = consumerService.updateConsumer(consumer);
			System.out.println(consumerdto);
			            return new ResponseEntity<Object>(consumerdto, HttpStatus.OK);
            
        } catch (ConsumerException e) {
        	
            return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
	}
	
	@DeleteMapping("/v1/consumer/{id}")
	public String deleteConsumer(@PathVariable long id) {
		
		consumerService.deleteConsumer(id);
		
		return "Successfully Deleted consumer";
		
	}
	

}

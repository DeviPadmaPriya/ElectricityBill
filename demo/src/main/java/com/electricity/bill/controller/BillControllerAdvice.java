package com.electricity.bill.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.electricity.bill.ecxeption.BillException;

//import com.cg.consumer.exceptions.ConsumerException;


@RestControllerAdvice
public class BillControllerAdvice {
	
	@ExceptionHandler(BillException.class)
    public ResponseEntity<String> ConsumerServiceException(BillException ex) {
        return new ResponseEntity<String>(ex.getMessage(), HttpStatus.OK);
    }
	  
	  @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception ex) {
        return new ResponseEntity<String>(ex.getMessage(),HttpStatus.BAD_REQUEST);
    }

}

package com.electricity.payment.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.electricity.payment.exception.PaymentException;

//import com.cg.consumer.exceptions.ConsumerException;


@RestControllerAdvice
public class PaymentControllerAdvice {
	@ExceptionHandler(PaymentException.class)
    public ResponseEntity<String> ConsumerServiceException(PaymentException ex) {
        return new ResponseEntity<String>(ex.getMessage(), HttpStatus.OK);
    }
	  
	  @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception ex) {
        return new ResponseEntity<String>(ex.getMessage(),HttpStatus.BAD_REQUEST);
    }

}

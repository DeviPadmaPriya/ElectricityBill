package com.cg.consumer.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cg.consumer.exceptions.ConsumerException;

@RestControllerAdvice
public class ConsumerAdviceController {
	  @ExceptionHandler(ConsumerException.class)
      public ResponseEntity<String> ConsumerServiceException(ConsumerException ex) {
          return new ResponseEntity<String>(ex.getMessage(), HttpStatus.OK);
      }
	  
	  @ExceptionHandler(Exception.class)
      public ResponseEntity<String> handleException(Exception ex) {
          return new ResponseEntity<String>(ex.getMessage(),HttpStatus.BAD_REQUEST);
      }

}
